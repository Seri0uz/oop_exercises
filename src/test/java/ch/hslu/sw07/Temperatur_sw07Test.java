package ch.hslu.sw07;

import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Temperatur_sw07Test {
    @Test
    public void equalsContract() {
        EqualsVerifier.forClass(Temperatur_sw07.class).suppress(Warning.NONFINAL_FIELDS).verify();
    }

}