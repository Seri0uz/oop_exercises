package ch.hslu.repetition;

import java.util.Objects;

public final class Raum implements Comparable<Raum> {
    private int raumID;
    private int raumCapacity;
    protected RaumState raumState;
    protected Raum(final int raumID, final int raumCapacity) {
        if (validateInvalidRaumID(raumID))
        {
            throw new IllegalArgumentException("Raum ID must be between 100 and 999");
        }
        if (validateInvalidRaumCapacity(raumCapacity))
        {
            throw new IllegalArgumentException("Raum Capacity must be 2 or greater");
        }
        this.raumID = raumID;
        this.raumCapacity = raumCapacity;
        this.raumState = RaumState.FREE;
    }
    public int getRaumID() {
        return raumID;
    }
    public int getRaumCapacity() {
        return raumCapacity;
    }
    public boolean validateInvalidRaumID (int raumID) {
        return raumID < 100 || raumID > 999;
    }
    public boolean validateInvalidRaumCapacity (int raumCapacity) {
        return raumCapacity < 2;
    }


    @Override
    public String toString() {
        return "Raum ID: " + raumID + ", Capacity: " + raumCapacity;
    }

    @Override
    public boolean equals(final Object object) {
        if (this == object)
            return true;
        return (object instanceof Raum raum)
                && this.raumID == raum.raumID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(raumID);
    }

    @Override
    public int compareTo(Raum raum) {
        return Integer.compare(this.raumID, raum.raumID);
    }

}
