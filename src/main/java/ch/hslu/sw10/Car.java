package ch.hslu.sw10;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 * @author Samuel Duss
 */
public final class Car implements Switchable
{
    private static final Logger LOG =
            LoggerFactory.getLogger(Car.class);
    private Engine engine;
    private Lights lights;
    private State state;

    public Car()
    {
        this.engine = new Engine();
        this.engine.addPropertyChangeListener(event -> LOG.info("Status: {} {}", event.getPropertyName(), event.getNewValue()));
        this.lights = new Lights();
        this.lights.addPropertyChangeListener(event -> LOG.info("Status: {} {}", event.getPropertyName(), event.getNewValue()));
        this.state = State.OFF;
    }

    /**
     *
     */
    public void switchOn()
    {
        if(isSwitchedOff()){
            this.state = State.ON;
            engine.switchOn();
            lights.switchOn();
            System.out.println("Das Fahrzeug wird gestartet");
        }
    }
    
    public void switchOff()
    {
        if(isSwitchedOn()){
            this.state = State.OFF;
            engine.switchOff();
            lights.switchOff();
            System.out.print("Das Fahrzeug wird abgeschaltet");
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

    public static void main(final String[] args) {
        Car car = new Car();
        car.switchOn();
        car.switchOff();
    }
}