package ch.hslu.sw08;

import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Temperatur_sw08Test {

    @Test
    void equalsContract() {
        EqualsVerifier.forClass(Temperatur_sw08.class).suppress(Warning.NONFINAL_FIELDS).verify();
    }

    @Test
    void convertKelvinToCelsius() {
        assertEquals(26.85f,Temperatur_sw08.convertKelvinToCelsius(300f),0.01f);
    }

    @Test
    void convertCelsiusToKelvin() {
        assertEquals(283.15f,Temperatur_sw08.convertCelsiusToKelvin(10f),0.01f);
    }

}