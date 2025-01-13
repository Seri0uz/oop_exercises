package ch.hslu.FS20;

import ch.hslu.demo.*;
import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RasenmäherTest {
    @Test
    void testRasenmäher() {
        Rasenmäher rasenmäher = new RasenmäherTypeA(new Antrieb());
        assertInstanceOf(Antrieb.class,rasenmäher.getAntrieb());
        assertInstanceOf(Messer.class,rasenmäher.getMesser());
    }

    @Test
    void getSerialNumber() {
        Rasenmäher.COUNTER = 20000;
        Rasenmäher rasenmäher = new RasenmäherTypeA(new Antrieb());
        assertEquals("SV20000",rasenmäher.getSerialNumber());
    }

    @Test
    void getSerialNumberLength() {
        Rasenmäher rasenmäher = new RasenmäherTypeA(new Antrieb());
        assertEquals(7,rasenmäher.getSerialNumber().length());
    }

    @Test
    void getDifferentSerialNumber() {
        Rasenmäher rasenmäher1 = new RasenmäherTypeA(new Antrieb());
        Rasenmäher rasenmäher2 = new RasenmäherTypeA(new Antrieb());
        assertNotEquals(rasenmäher2.getSerialNumber(),rasenmäher1.getSerialNumber());
    }

    @Test
    void equalsContract() {
        EqualsVerifier.forClass(Rasenmäher.class).suppress(Warning.NONFINAL_FIELDS).verify();
    }

    @Test
    void compareSerialNumbersHigher() {
        Rasenmäher rasenmäher = new RasenmäherTypeA(new Antrieb());
        Rasenmäher rasenmäher1 = new RasenmäherTypeA(new Antrieb());
        assertEquals(-1,rasenmäher.compareTo(rasenmäher1));
    }

    @Test
    void compareSerialNumbersLower() {
        Rasenmäher rasenmäher = new RasenmäherTypeA(new Antrieb());
        Rasenmäher rasenmäher1 = new RasenmäherTypeA(new Antrieb());
        assertEquals(1,rasenmäher1.compareTo(rasenmäher));
    }

    @Test
    void compareSerialNumbersEqual() {
        Rasenmäher rasenmäher = new RasenmäherTypeA(new Antrieb());
        assertEquals(0,rasenmäher.compareTo(rasenmäher));
    }

    @Test
    void testGenerationTypeA() {
        Rasenmäher rasenmäher = new RasenmäherTypeA(new Antrieb());
        Assertions.assertEquals(Generation.G1,rasenmäher.getGeneration());
    }

    @Test
    void testGenerationTypeB() {
        Rasenmäher rasenmäher = new RasenmäherTypeB(new Antrieb());
        assertEquals(Generation.G2,rasenmäher.getGeneration());
    }

    @Test
    void testInvalidGeneration() {
        final Exception e = assertThrows(IllegalArgumentException.class, () -> {
            new RasenmäherTypeC(new Antrieb());
        });
        assertEquals("Messer is not compatible to generation", e.getMessage());
    }
}