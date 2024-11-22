package ch.hslu.sw10;


import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.*;


public final class TemperaturVerlauf implements TemperaturCollection {
    final List<Temperatur> temperatures = new ArrayList<>();

    private final List<PropertyChangeListener> temperaturMinListener = new ArrayList<>();
    private final List<PropertyChangeListener> temperaturMaxListener = new ArrayList<>();


    public boolean add(final Temperatur temperatur) {
        if (!temperatures.isEmpty()) {
            Temperatur max = Collections.max(temperatures);
            Temperatur min = Collections.min(temperatures);
            if (temperatur.getKelvin() > max.getKelvin()) {
                final PropertyChangeEvent event = new PropertyChangeEvent(this, "temperaturMaxListener", max.getKelvin(), temperatur.getKelvin());
                this.firePropertyChangeEventMax(event);
            }
            if (temperatur.getKelvin() < min.getKelvin()) {
                final PropertyChangeEvent event = new PropertyChangeEvent(this, "temperaturMinListener", min.getKelvin(), temperatur.getKelvin());
                this.firePropertyChangeEventMin(event);
            }
        }
        return this.temperatures.add(temperatur);
    }

    public void clear() {
        this.temperatures.clear();
    }


    public int getCount() {
        return this.temperatures.size();
    }


    public Temperatur getMax() {
        if (temperatures.isEmpty())
            return null;
        return new Temperatur(Collections.max(temperatures));
    }


    public Temperatur getMin() {
        if (temperatures.isEmpty())
            return null;
        return new Temperatur(Collections.min(temperatures));
    }


    public Temperatur getAverage() {
        float tempSum = 0.0f;
        if (this.temperatures.isEmpty())
            return null;

        for (final Temperatur temperatur : temperatures) {
            tempSum += temperatur.getKelvin();
        }
        float tempAverage = tempSum / this.getCount();
        return Temperatur.createFromKelvin(tempAverage);
    }

    public void addPropertyChangeListenerMax(final PropertyChangeListener listener) {
        if (listener != null) {
            this.temperaturMaxListener.add(listener);
        }
    }

    public void removePropertyChangeListenerMax(final PropertyChangeListener listener) {
        if (listener != null) {
            this.temperaturMaxListener.remove(listener);
        }
    }

    public void addPropertyChangeListenerMin(final PropertyChangeListener listener) {
        if (listener != null) {
            this.temperaturMinListener.add(listener);
        }
    }

    public void removePropertyChangeListenerMin(final PropertyChangeListener listener) {
        if (listener != null) {
            this.temperaturMinListener.remove(listener);
        }
    }

    private void firePropertyChangeEventMax(final PropertyChangeEvent event) {
        for (final PropertyChangeListener listener : this.temperaturMaxListener) {
            listener.propertyChange(event);
        }
    }

    private void firePropertyChangeEventMin(final PropertyChangeEvent event) {
        for (final PropertyChangeListener listener : this.temperaturMinListener) {
            listener.propertyChange(event);
        }
    }

    @Override
    public String toString() {
        return "Temp Count: " + this.getCount() + "\nAverage Temp: " + this.getAverage() + "\nMax: " + this.getMax() + "\nMin: " + this.getMin();
    }

    public static void main(final String[] args) {
        TemperaturVerlauf temperaturVerlauf = new TemperaturVerlauf();
    }

}
