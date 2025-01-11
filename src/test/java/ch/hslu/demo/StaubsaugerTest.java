package ch.hslu.demo;

import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StaubsaugerTest {

    @Test
    void equalsContract() {
        EqualsVerifier.forClass(Staubsauger.class).suppress(Warning.NONFINAL_FIELDS).verify();
    }

    @Test
    void getMotor(){
        Staubsauger sauger = new Staubsauger("Typ1");
        assertEquals("High", sauger.getMotor().getLeistung());
    }

    @Test
    void testModelValid(){
        Staubsauger sauger = new Staubsauger("Typ12345678912345");
        assertEquals("Typ12345678912345", sauger.getModel());
    }

    @Test
    void testModelInvalidNull(){
        final Exception e = assertThrows(IllegalArgumentException.class, () -> {
            Staubsauger sauger = new Staubsauger(null);
        });
        assertEquals("Invalid model", e.getMessage());
    }

    @Test
    void testModelInvalidEmpty(){
        final Exception e = assertThrows(IllegalArgumentException.class, () -> {
            Staubsauger sauger = new Staubsauger("");
        });
        assertEquals("Invalid model", e.getMessage());
    }

    @Test
    void testModelInvalidLength(){
        final Exception e = assertThrows(IllegalArgumentException.class, () -> {
            Staubsauger sauger = new Staubsauger("Typ123456789123456");
        });
        assertEquals("Invalid model", e.getMessage());
    }

    @Test
    void compareStaubsauger(){
        Staubsauger sauger1 = new Staubsauger("Typ1", "High");
        Staubsauger sauger2 = new Staubsauger("Typ1", "Low");
        assertNotEquals(sauger1, sauger2);
    }

    @Test
    void getStaubsaugerWeight(){
        Staubsauger sauger1 = new Staubsauger(9.9, "Typ1");
        assertEquals(9.9, sauger1.getWeight(),0.075);
    }

}