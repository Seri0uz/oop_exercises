package ch.hslu.repetition;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RaumTest {
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
        assertEquals(new Raum(690,12),raum.get(690));
    }

    @Test
    void getRaumNotFound() {
        RaumVerwaltung raum = new RaumVerwaltung();
        raum.add(new Raum(690,12));
        assertNull(raum.get(600));
    }
}