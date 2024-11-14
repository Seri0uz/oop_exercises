package ch.hslu.sw09;

import org.junit.jupiter.api.Test;

import static ch.hslu.sw09.Temperatur_sw09.createFromKelvin;
import static ch.hslu.sw09.Temperatur_sw09.createFromCelsius;
import static org.junit.jupiter.api.Assertions.*;

class Temperatur_sw09Test {

    @Test
    void createFromKelvinTest() {
        Temperatur_sw09 temp = createFromKelvin(20f);
        assertEquals(20f,temp.getKelvin());
    }

    @Test
    void createFromCelsiusTest() {
        Temperatur_sw09 temp = createFromCelsius(20f);
        assertEquals(20f,temp.getCelsius());
    }

    @Test
    void createFromKelvinIllegalKelvin() {
        final Exception e = assertThrows(IllegalArgumentException.class, () -> {
            createFromKelvin(-1f);
        });
        assertEquals("Temperature has to be over 0 Kelvin", e.getMessage());
    }

    @Test
    void createFromKelvinIllegalCelsius() {
        final Exception e = assertThrows(IllegalArgumentException.class, () -> {
            createFromCelsius(-273.16f);
        });
        assertEquals("Temperature has to be over -273.15 Celsius", e.getMessage());
    }

}