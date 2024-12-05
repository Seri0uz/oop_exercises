package ch.hslu.sw10;


public interface TemperaturEventInterface {

    EventType getEventType();
    Temperatur getNewValue();
    Temperatur getOldValue();

}
