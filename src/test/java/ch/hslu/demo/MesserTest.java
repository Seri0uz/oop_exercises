package ch.hslu.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MesserTest {

    @Test
    void testMesserKlinge() {
        Messer messer = new Messer();
        assertEquals("gebogen",messer.getKlinge());
    }

    @Test
    void testMesserKlinge2() {
        Messer messer = new Messer();
        messer.setKlinge("gerade");
        assertEquals("gerade",messer.getKlinge());
    }

}