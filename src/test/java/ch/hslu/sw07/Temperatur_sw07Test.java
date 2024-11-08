package ch.hslu.sw07;

import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Temperatur_sw07Test {
    @Test
    void equalsContract() {
        EqualsVerifier.forClass(Temperatur_sw07.class).suppress(Warning.NONFINAL_FIELDS).verify();
    }

    @Test
    void compareSameTemp() {
        Temperatur_sw07 temperatur = new Temperatur_sw07(20);
        Temperatur_sw07 temperatur1 = new Temperatur_sw07(20);
        assertEquals(0, temperatur.compareTo(temperatur1));
    }

    @Test
    void compareFirstTempLarger() {
        Temperatur_sw07 temperatur = new Temperatur_sw07(30);
        Temperatur_sw07 temperatur1 = new Temperatur_sw07(20);
        assertTrue(temperatur.compareTo(temperatur1)<=-1);
    }

    @Test
    void compareSecondTempLarger() {
        Temperatur_sw07 temperatur = new Temperatur_sw07(10);
        Temperatur_sw07 temperatur1 = new Temperatur_sw07(18.3f);
        assertTrue(temperatur.compareTo(temperatur1)>=1);
    }



}