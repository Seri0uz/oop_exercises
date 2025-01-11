package ch.hslu.repetition;


import java.util.*;


public final class RaumVerwaltung {
    private final Set<Raum> raums = new TreeSet<>();

    private final List<RaumEventListener> listeners = new ArrayList<>();

    public RaumVerwaltung() {
        //this.add(new Raum(600,18));
        //this.add(new Raum(602,6));
        //this.add(new Raum(603,12));
        //this.add(new Raum(605,24));
        //this.add(new Raum(610,12));
    }

    public boolean add(final Raum raum) {
        return this.raums.add(raum);
    }

    public void clear() {
        this.raums.clear();
    }

    public int getCount() {
        return this.raums.size();
    }

    public Raum get() {
        for (final Raum raum : this.raums) {
            return raum;
        }
        return null;
    }

    public Raum getRaumID(final float raumID) {
        for (Raum raum : raums) {
            if (raumID == raum.getRaumID()) {
                return raum;
            }
        }
        return null;
    }

    public Raum bookRaum(final int capacity) {
        int smallestSize = capacity;
        Raum bestRaum = null;
        for (Raum raum : raums) {
            if (raum.getRaumState() && capacity <= raum.getRaumCapacity()) {
                int smallestSizeTemp = raum.getRaumCapacity() - capacity;
                if (smallestSizeTemp < smallestSize) {
                    smallestSize = smallestSizeTemp;
                    bestRaum = raum;
                }
            }
        }
        if (bestRaum == null)
            return null;

        bestRaum.setRaumState(RaumState.BOOKED);
        RaumEvent event = new RaumEvent(this,bestRaum,bestRaum.getRaumCapacity(),RaumState.BOOKED);
        this.fireRaumEvent(event);
        return bestRaum;
    }

    public RaumState releaseRaum(int raumID) {
        Raum raum = getRaumID(raumID);
        raum.setRaumState(RaumState.FREE);
        RaumEvent event = new RaumEvent(this,raum,raum.getRaumCapacity(),RaumState.FREE);
        this.fireRaumEvent(event);

        return raum.raumState;
    }

    public void addListener(final RaumEventListener listener) {
        if (listener != null) {
            this.listeners.add(listener);
        }
    }

    public void removeListener(final RaumEventListener listener) {
        if (listener != null) {
            this.listeners.remove(listener);
        }
    }

    private void fireRaumEvent(RaumEvent event) {
        for (final RaumEventListener listener : this.listeners) {
            listener.handleRaumEvent(event);
        }
    }

    @Override
    public String toString() {
        return raums.toString();
    }

    public static void main(final String[] args) {
        RaumVerwaltung raumVerwaltung = new RaumVerwaltung();
        raumVerwaltung.add(new Raum(100,20) );
        raumVerwaltung.add(new Raum(300,40) );
        raumVerwaltung.add(new Raum(201,50) );
        raumVerwaltung.add(new Raum(202,60) );
        raumVerwaltung.add(new Raum(203,100) );
    }
}
