package ch.hslu.demo;

import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class MotorTest {
    @Test
    void equalsContract() {
        EqualsVerifier.forClass(Motor.class).suppress(Warning.NONFINAL_FIELDS).verify();
    }

    @Test
    void testMotor() {
        Motor motor = new Motor();
        assertEquals("High",motor.getLeistung());
    }

    @Test
    void testMotor2() {
        Motor motor = new Motor("Low");
        assertEquals("Low",motor.getLeistung());
    }

    @Test
    void compareMotorEqual() {
        Motor motor = new Motor("Low");
        assertEquals(new Motor("Low"),motor);
    }

    @Test
    void compareMotorNotEqual() {
        Motor motor = new Motor("High");
        assertNotEquals(new Motor("Low"),motor);
    }

}