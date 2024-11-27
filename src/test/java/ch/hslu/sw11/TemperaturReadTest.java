package ch.hslu.sw11;

import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class TemperaturReadTest {

    @Test
    void TemperaturFileExists() {
        assertTrue(new File("E:/netatmo-export-202301-202304.csv").exists());
    }

    @Test
    void TemperaturReadFileDoesNotExist() {
        TemperaturRead temperaturRead = new TemperaturRead();
        assertNull(temperaturRead.readTemperaturFromCSV("test.txt"));
    }
}