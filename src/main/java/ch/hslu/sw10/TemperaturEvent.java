package ch.hslu.sw10;

import java.io.Serial;
import java.util.EventObject;

public class TemperaturEvent extends EventObject implements TemperaturEventInterface {
    @Serial
    private static final long serialVersionUID = 1L;
    private final EventType eventType;
    private final Temperatur newValue;
    private final Temperatur oldValue;


    public TemperaturEvent(Object source, Temperatur oldValue, Temperatur newValue, EventType eventType) {
        super(source);
        this.newValue = newValue;
        this.oldValue = oldValue;
        this.eventType = eventType;
    }
    public Temperatur getNewValue() {
        return this.newValue;
    }
    public Temperatur getOldValue() {
        return this.oldValue;
    }
    public EventType getEventType() {
        return eventType;
    }

}