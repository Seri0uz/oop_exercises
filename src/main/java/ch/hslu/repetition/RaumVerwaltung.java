package ch.hslu.repetition;


import java.util.*;


public final class RaumVerwaltung {
    final Set<Raum> raums = new TreeSet<>();

    public boolean add(final Raum raum) {
        return this.raums.add(raum);
    }

    public void clear() {
        this.raums.clear();
    }

    public int getCount() {
        return this.raums.size();
    }

    public Raum get(final float raumID) {
        for (Raum raum : raums) {
            if (raumID == raum.getRaumID()) {
                return raum;
            }
        }
        return null;
    }

    public static void main(final String[] args) {
        RaumVerwaltung raumVerwaltung = new RaumVerwaltung();
        raumVerwaltung.add(new Raum(100,20) );
        raumVerwaltung.add(new Raum(300,40) );
        raumVerwaltung.add(new Raum(200,50) );
    }
}
