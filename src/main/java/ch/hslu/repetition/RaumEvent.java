package ch.hslu.repetition;


import java.io.Serial;
import java.util.EventObject;

public class RaumEvent extends EventObject {
    @Serial
    private static final long serialVersionUID = 1L;
    private final Raum raum;
    private final int capacity;
    private final RaumState state;

    public RaumEvent (Object source, Raum raum, int capacity, RaumState state) {
        super(source);
        this.raum = raum;
        this.capacity = capacity;
        this.state = state;
    }
    public int getCapacity() {
        return capacity;
    }
    public Raum getRaum() {
        return raum;
    }
    public RaumState getState() {
        return state;
    }
}
