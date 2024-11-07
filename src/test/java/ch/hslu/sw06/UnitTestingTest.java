package ch.hslu.sw06;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

final class UnitTestingTest {

    @Test
    void test1Max() {
        assertEquals(3,UnitTesting.max(3,0));
    }
    @Test
    void test2Max() {
        assertEquals(4,UnitTesting.max(0,4));
    }
    @Test
    void test3Max() {
        assertEquals(5,UnitTesting.max(5,5));
    }
}