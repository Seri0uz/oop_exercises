package ch.hslu.sw06;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void addNull() {
        Calculator calculator = new Add();
        assertEquals(0,calculator.add(0,0));
    }
    @Test
    void add2Test() {
        Calculator calculator = new Add();
        assertEquals(7,calculator.add(4,3));
    }
    @Test
    void addOneMinusValue() {
        Calculator calculator = new Add();
        assertEquals(4,calculator.add(-1,5));
    }
    @Test
    void addBothMinusValues() {
        Calculator calculator = new Add();
        assertEquals(-5,calculator.add(-3,-2));
    }
    @Test
    void addIntMaxTest() {
        Calculator calculator = new Add();
        assertEquals((long) Integer.MAX_VALUE + Integer.MAX_VALUE,calculator.add(Integer.MAX_VALUE,Integer.MAX_VALUE));
    }
    @Test
    void addIntMinTest() {
        Calculator calculator = new Add();
        assertEquals((long) Integer.MIN_VALUE + Integer.MIN_VALUE, calculator.add(Integer.MIN_VALUE,Integer.MIN_VALUE));
    }


}