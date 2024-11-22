package ch.hslu.sw10;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

/**
 * Beschreiben Sie hier die Klasse Engine.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public final class Engine implements Switchable
{
    private final List<PropertyChangeListener> changeListeners = new ArrayList<>();
    private int rpm;
    private State state;

    public Engine()
    {
        this.rpm = 0;
        this.state = State.OFF;
    }

    @Override
    public void switchOn() {
        if (isSwitchedOff()){
            this.state = State.ON;
            this.rpm = 1200;
            final PropertyChangeEvent event = new PropertyChangeEvent(this, "engine", State.OFF.getState(), State.ON.getState());
            this.firePropertyChangeEvent(event);
        }
    }

    @Override
    public void switchOff() {
        if (isSwitchedOn()){
            this.state = State.OFF;
            final PropertyChangeEvent event = new PropertyChangeEvent(this, "engine", State.ON.getState(), State.OFF.getState());
            this.firePropertyChangeEvent(event);
        }
    }

    @Override
    public boolean isSwitchedOn() {
        return this.state == State.ON;
    }

    @Override
    public boolean isSwitchedOff() {
        return this.state == State.OFF;
    }

    private void firePropertyChangeEvent(final PropertyChangeEvent event) {
        for (final PropertyChangeListener listener : this.changeListeners) {
            listener.propertyChange(event);
        }
    }

    public void addPropertyChangeListener(final PropertyChangeListener listener) {
        if (listener != null) {
            this.changeListeners.add(listener);
        }
    }

    public void removePropertyChangeListener(final PropertyChangeListener listener) {
        if (listener != null) {
            this.changeListeners.remove(listener);
        }
    }
}
