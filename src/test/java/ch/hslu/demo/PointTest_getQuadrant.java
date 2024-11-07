package ch.hslu.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest_getQuadrant {

    @Test
    void getQuadrant1() {
        assertEquals(1, new Point(1, 1).getQuadrant());
    }
    @Test
    void getQuadrant2() {
        assertEquals(2, new Point(-1, 1).getQuadrant());
    }
    @Test
    void getQuadrant3() {
        assertEquals(3, new Point(-1, -1).getQuadrant());
    }
    @Test
    void getQuadrant4() {
        assertEquals(4, new Point(1, -1).getQuadrant());
    }
}