package ch.hslu.FS20;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenerationTest {
    @Test
    void testGeneration() {
        Assertions.assertEquals(2012, Generation.G1.getYear());
        assertEquals(2013,Generation.G2.getYear());
        assertEquals(2019,Generation.G3.getYear());
    }

}