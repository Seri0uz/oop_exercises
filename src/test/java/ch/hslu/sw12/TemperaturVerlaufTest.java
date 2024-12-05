package ch.hslu.sw12;

import ch.hslu.sw08.TemperaturVerlauf;
import ch.hslu.sw08.Temperatur_sw08;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperaturVerlaufTest {
    @Test
    void getMaxTemperaturNull() {
        ch.hslu.sw08.TemperaturVerlauf temperaturVerlauf = new ch.hslu.sw08.TemperaturVerlauf();
        assertNull(temperaturVerlauf.getMax());
    }

    @Test
    void getMaxTemperatur() {
        ch.hslu.sw08.TemperaturVerlauf temperaturVerlauf = new ch.hslu.sw08.TemperaturVerlauf();
        temperaturVerlauf.add(new Temperatur_sw08(267f));
        temperaturVerlauf.add(new Temperatur_sw08(560f));
        temperaturVerlauf.add(new Temperatur_sw08(330f));
        Temperatur_sw08 maxTemperatur = temperaturVerlauf.getMax();
        assertEquals(560f,maxTemperatur.getKelvin(),0.001f);
    }

    @Test
    void getMinTemperaturNull() {
        ch.hslu.sw08.TemperaturVerlauf temperaturVerlauf = new ch.hslu.sw08.TemperaturVerlauf();
        assertNull(temperaturVerlauf.getMin());

    }

    @Test
    void getMinTemperatur() {
        ch.hslu.sw08.TemperaturVerlauf temperaturVerlauf = new ch.hslu.sw08.TemperaturVerlauf();
        temperaturVerlauf.add(new Temperatur_sw08(267f));
        temperaturVerlauf.add(new Temperatur_sw08(500f));
        temperaturVerlauf.add(new Temperatur_sw08(268f));
        Temperatur_sw08 minTemperatur = temperaturVerlauf.getMin();
        assertEquals(267f,minTemperatur.getKelvin(),0.001f);
    }

    @Test
    void getAverageTemperaturNull() {
        ch.hslu.sw08.TemperaturVerlauf temperaturVerlauf = new ch.hslu.sw08.TemperaturVerlauf();
        assertNull(temperaturVerlauf.getAverage());
    }

    @Test
    void getAverageTemperatur() {
        ch.hslu.sw08.TemperaturVerlauf temperaturVerlauf = new TemperaturVerlauf();
        temperaturVerlauf.add(new Temperatur_sw08(267f));
        temperaturVerlauf.add(new Temperatur_sw08(560f));
        temperaturVerlauf.add(new Temperatur_sw08(330f));
        temperaturVerlauf.add(new Temperatur_sw08(100f));
        Temperatur_sw08 averageTemperatur = temperaturVerlauf.getAverage();
        assertEquals(314.25f,averageTemperatur.getKelvin(),0.001f);
    }

}