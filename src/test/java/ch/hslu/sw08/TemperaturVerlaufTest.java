package ch.hslu.sw08;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperaturVerlaufTest {

    @Test
    void addTemperatur() {
        TemperaturVerlauf temperaturVerlauf = new TemperaturVerlauf();
        temperaturVerlauf.add(new Temperatur_sw08(267f));
        temperaturVerlauf.add(new Temperatur_sw08(560f));
        assertEquals(2,temperaturVerlauf.getCount());
    }

    @Test
    void clearTemperatur() {
        TemperaturVerlauf temperaturVerlauf = new TemperaturVerlauf();
        temperaturVerlauf.add(new Temperatur_sw08(267f));
        temperaturVerlauf.add(new Temperatur_sw08(560f));
        temperaturVerlauf.clear();
        assertEquals(0,temperaturVerlauf.getCount());
    }

    @Test
    void getMaxTemperaturNull() {
        TemperaturVerlauf temperaturVerlauf = new TemperaturVerlauf();
        assertNull(temperaturVerlauf.getMax());
    }

    @Test
    void getMaxTemperatur() {
        TemperaturVerlauf temperaturVerlauf = new TemperaturVerlauf();
        temperaturVerlauf.add(new Temperatur_sw08(267f));
        temperaturVerlauf.add(new Temperatur_sw08(560f));
        temperaturVerlauf.add(new Temperatur_sw08(330f));
        Temperatur_sw08 maxTemperatur = temperaturVerlauf.getMax();
        assertEquals(560f,maxTemperatur.getKelvin(),0.001f);
    }

    @Test
    void getMinTemperaturNull() {
        TemperaturVerlauf temperaturVerlauf = new TemperaturVerlauf();
        assertNull(temperaturVerlauf.getMin());

    }

    @Test
    void getMinTemperatur() {
        TemperaturVerlauf temperaturVerlauf = new TemperaturVerlauf();
        temperaturVerlauf.add(new Temperatur_sw08(267f));
        temperaturVerlauf.add(new Temperatur_sw08(500f));
        temperaturVerlauf.add(new Temperatur_sw08(268f));
        Temperatur_sw08 minTemperatur = temperaturVerlauf.getMin();
        assertEquals(267f,minTemperatur.getKelvin(),0.001f);
    }

    @Test
    void getAverageTemperaturNull() {
        TemperaturVerlauf temperaturVerlauf = new TemperaturVerlauf();
        assertNull(temperaturVerlauf.getAverage());
    }

    @Test
    void getAverageTemperatur() {
        TemperaturVerlauf temperaturVerlauf = new TemperaturVerlauf();
        temperaturVerlauf.add(new Temperatur_sw08(267f));
        temperaturVerlauf.add(new Temperatur_sw08(560f));
        temperaturVerlauf.add(new Temperatur_sw08(330f));
        temperaturVerlauf.add(new Temperatur_sw08(100f));
        Temperatur_sw08 averageTemperatur = temperaturVerlauf.getAverage();
        assertEquals(314.25f,averageTemperatur.getKelvin(),0.001f);
    }



}