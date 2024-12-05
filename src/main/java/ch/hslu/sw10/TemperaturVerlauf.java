package ch.hslu.sw10;


import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public final class TemperaturVerlauf implements TemperaturCollection {
    private final List<Temperatur> temperatures = new ArrayList<>();

    private final List<TemperaturEventListener> listeners = new ArrayList<>();

    private Temperatur tempMax = null;
    private Temperatur tempMin = null;


    public boolean add(final Temperatur temperatur) {
        checkForTemperaturLimits(temperatur);
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
            return tempMax = null;
        tempMax = Collections.max(temperatures);
        return new Temperatur(tempMax);
    }


    public Temperatur getMin() {
        if (temperatures.isEmpty())
            return tempMin = null;
        tempMin = Collections.min(temperatures);
        return new Temperatur(tempMin);
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

    public void checkForTemperaturLimits(Temperatur temperatur) {
        if (this.tempMax == null || temperatur.getCelsius() > this.tempMax.getCelsius()) {
            Temperatur previousMax = this.tempMax;
            this.tempMax = temperatur;
            TemperaturEvent event = new TemperaturEvent(this, previousMax, temperatur, EventType.MAX);
            this.fireTemperaturEvent(event);
        }
        if (this.tempMin == null || temperatur.getCelsius() < this.tempMin.getCelsius()) {
            Temperatur previousMin = this.tempMin;
            this.tempMin = temperatur;
            TemperaturEvent event = new TemperaturEvent(this, previousMin, temperatur, EventType.MIN);
            this.fireTemperaturEvent(event);
        }
    }

    public void addListener(final TemperaturEventListener listener) {
        if (listener != null) {
            this.listeners.add(listener);
        }
    }

    public void removeListener(final PropertyChangeListener listener) {
        if (listener != null) {
            this.listeners.remove(listener);
        }
    }

    private void fireTemperaturEvent(TemperaturEvent event) {
        for (final TemperaturEventListener listener : this.listeners) {
            listener.handleTemperaturEvent(event);
        }
    }


    @Override
    public String toString() {
        return "Temp Count: " + this.getCount() + "\nAverage Temp: " + this.getAverage() + "\nMax: " + this.getMax() + "\nMin: " + this.getMin();
    }

}
