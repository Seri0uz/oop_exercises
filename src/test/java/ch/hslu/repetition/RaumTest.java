package ch.hslu.repetition;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RaumTest {
    Raum raum;
    RaumVerwaltung raumVerwaltung;

    @BeforeEach
    void prepareTest() {
        this.raum = null;
        this.raumVerwaltung = new RaumVerwaltung();
        this.raumVerwaltung.addListener(this::handleRaumVerwaltungEvent);
    }


    @Test
    void testRaumConstructorInvalidID() {
        final Exception e = assertThrows(IllegalArgumentException.class, () -> new Raum(99,30));
        assertEquals("Raum ID must be between 100 and 999", e.getMessage());
    }

    @Test
    void testRaumConstructorValid() {
        Raum raum = new Raum(120,30);
        assertEquals(120,raum.getRaumID());
    }

    @Test
    void testRaumCapacityInvalid() {
        final Exception e = assertThrows(IllegalArgumentException.class, () -> new Raum(101,1));
        assertEquals("Raum Capacity must be 2 or greater", e.getMessage());
    }

    @Test
    void testRaumEqual() {
        Raum raum = new Raum(100,30);
        Raum raum1 = new Raum(100,30);
        assertEquals(raum, raum1);
    }

    @Test
    void testRaumNotEqual() {
        Raum raum = new Raum(980,10);
        Raum raum1 = new Raum(981,12);
        assertNotEquals(raum, raum1);
    }

    @Test
    void addNewRaum() {
        RaumVerwaltung raumVerwaltung = new RaumVerwaltung();
        raumVerwaltung.add(new Raum(603,12));
        assertEquals(1,raumVerwaltung.getCount());
    }

    @Test
    void getRaum() {
        RaumVerwaltung raum = new RaumVerwaltung();
        raum.add(new Raum(690,12));
        raum.add(new Raum(691,12));
        raum.add(new Raum(689,12));
        assertEquals(new Raum(690,12),raum.getRaumID(690));
    }

    @Test
    void getRaumNotFound() {
        RaumVerwaltung raum = new RaumVerwaltung();
        raum.add(new Raum(690,12));
        assertNull(raum.getRaumID(600));
    }

    @Test
    void getSuitableRaum() {
        RaumVerwaltung raum = new RaumVerwaltung();
        raum.add(new Raum(690,9));
        raum.add(new Raum(691,10));
        raum.add(new Raum(693,30));
        assertEquals(new Raum(691,10),raum.bookRaum(10));
    }

    @Test
    void getSuitableRaumNotFound() {
        RaumVerwaltung raum = new RaumVerwaltung();
        raum.add(new Raum(690,9));
        assertNull(raum.bookRaum(10));
    }

    @Test
    void testRaumEventBooked() {
        Raum raum = new Raum(790,23);
        this.raumVerwaltung.add(raum);
        this.raumVerwaltung.bookRaum(23);
        assertEquals(raum, this.raum);
    }

    void handleRaumVerwaltungEvent(RaumEvent event) {
        raum = event.getRaum();
    }
}