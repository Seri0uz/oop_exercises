package ch.hslu.sw13;

import ch.hslu.sw10.State;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

public class Motor implements Switchable {
    private final List<PropertyChangeListener> changeListeners = new ArrayList<>();
    private int rpm;
    private State state;

    private static final Logger LOG =
            LoggerFactory.getLogger(Motor.class);

    Motor() {
        rpm = 0;
        state = State.OFF;
    }
    @Override
    public void switchOn() {
        if (isSwitchedOff()){
            this.state = State.ON;
            this.rpm = 1200;
            final PropertyChangeEvent event = new PropertyChangeEvent(this, "engine", State.OFF.getState(), State.ON.getState());
            this.firePropertyChangeEvent(event);
            LOG.info("Motor Switched on");
        }
    }

    @Override
    public void switchOff() {
        if (isSwitchedOn()){
            this.state = State.OFF;
            final PropertyChangeEvent event = new PropertyChangeEvent(this, "engine", State.ON.getState(), State.OFF.getState());
            this.firePropertyChangeEvent(event);
            LOG.info("Motor Switched off");
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

}
