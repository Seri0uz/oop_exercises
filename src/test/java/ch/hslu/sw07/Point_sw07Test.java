package ch.hslu.sw07;

import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Point_sw07Test {
    @Test
    void equalsContract() {
        EqualsVerifier.forClass(Point_sw07.class).suppress(Warning.NONFINAL_FIELDS).verify();
    }

    @Test
    void samePoint() {
        Point_sw07 p1 = new Point_sw07(5, 5);
        Point_sw07 p2 = new Point_sw07(5, 5);
        assertEquals(0, p1.compareTo(p2));
    }
    @Test
    void differentPointX() {
        Point_sw07 p1 = new Point_sw07(5, 3);
        Point_sw07 p2 = new Point_sw07(8, 1);
        assertTrue(p1.compareTo(p2) <= -1);
    }

    @Test
    void differentPointY() {
        Point_sw07 p1 = new Point_sw07(7, 5);
        Point_sw07 p2 = new Point_sw07(7, 9);
        assertTrue(p1.compareTo(p2) >= 1);
    }

}