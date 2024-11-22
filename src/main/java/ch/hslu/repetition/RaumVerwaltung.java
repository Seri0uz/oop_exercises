package ch.hslu.repetition;


import java.util.ArrayList;
import java.util.List;
import java.util.Collections;


public final class RaumVerwaltung {
    final List<Raum> raums = new ArrayList<>();

    public boolean add(final Raum raum) {
        if (!raums.isEmpty()) {
            sort();
        }
        return this.raums.add(raum);

    }

    public void clear() {
        this.raums.clear();
    }

    public int getCount() {
        return this.raums.size();
    }

    public void sort() {
        Collections.sort(this.raums);
    }

    public Raum get(final float raumID) {
        for (Raum raum : raums) {
            if (raumID == raum.getRaumID()) {
                return this.raums.get(raums.indexOf(raum));
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
