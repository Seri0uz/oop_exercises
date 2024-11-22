package ch.hslu.sw10;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

/**
 * Beschreiben Sie hier die Klasse Motor.
 * 
 * @author Samuel Duss
 * @version (eine Versionsnummer oder ein Datum)
 */
public final class Lights implements Switchable
{

    private int lumen;
    private State state;
    private final List<PropertyChangeListener> changeListeners = new ArrayList<>();

    public Lights()
    {
        this.lumen = 0;
        this.state = State.OFF;
    }

    public void switchOn()
    {
        if(isSwitchedOff()){
            this.state = State.ON;
            this.lumen = 3000;
            final PropertyChangeEvent event = new PropertyChangeEvent(this, "lights", State.OFF.getState(), State.ON.getState());
            this.firePropertyChangeEvent(event);

        }
    }
    
    public void switchOff()
    {
        if(isSwitchedOn()){
            this.state = State.OFF;
            this.lumen = 0;
            final PropertyChangeEvent event = new PropertyChangeEvent(this, "lights", State.ON.getState(), State.OFF.getState());
            this.firePropertyChangeEvent(event);
        }
    }
    
    public boolean isSwitchedOn()
    {
        return this.state == State.ON;
    }
    
    public boolean isSwitchedOff()
    {
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