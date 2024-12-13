package ch.hslu.sw13;

import ch.hslu.sw10.State;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

public class Motor {
    private final List<PropertyChangeListener> changeListeners = new ArrayList<>();
    private int rpm;
    private State state;

    private static final Logger LOG =
            LoggerFactory.getLogger(Motor.class);

    Motor() {
        rpm = 0;
        state = State.OFF;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }


    public int getRpm() {
        return rpm;
    }

    public void setRpm(int rpm) {
        if (validateRpm(this.rpm)) {
            throw new IllegalArgumentException("RPM out of range");
        }
        this.rpm = rpm;
    }

    public static boolean validateRpm(int rpm) {
        return rpm >5000;
    }


}
