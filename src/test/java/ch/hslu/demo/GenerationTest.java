package ch.hslu.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenerationTest {
    @Test
    void testGeneration() {
        assertEquals(2012,Generation.G1.getYear());
        assertEquals(2013,Generation.G2.getYear());
        assertEquals(2019,Generation.G3.getYear());
    }

}