package ch.hslu.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RasenmäherLagerTest {
    @Test
    void countRasenmäherTypeA(){
        RasenmäherLager lager = new RasenmäherLager();
        assertEquals(2,lager.getRasenmäherTypeCount(Generation.G1));
    }
    @Test
    void countRasenmäherTypeB(){
        RasenmäherLager lager = new RasenmäherLager();
        assertEquals(1,lager.getRasenmäherTypeCount(Generation.G2));
    }
}