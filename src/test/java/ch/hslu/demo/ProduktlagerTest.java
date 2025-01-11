package ch.hslu.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class ProduktlagerTest {

    @Test
    void testProduktlagerTotalWeight() {
        Produktlager produktlager = new Produktlager();
        produktlager.addStandardStaubsauger();
        assertEquals(31.0d,produktlager.getTotalWeight().getWeight(),0.01);
    }

    @Test
    void testProduktlagerTotalWeightZero() {
        Produktlager produktlager = new Produktlager();
        assertNull(produktlager.getTotalWeight());
    }

    @Test
    void testProduktlagerMaxWeight() {
        Produktlager produktlager = new Produktlager();
        produktlager.addStandardStaubsauger();
        assertEquals(14.0d,produktlager.getMaxWeight().getWeight(),0.01);
    }

    @Test
    void testProduktlagerMaxWeightZero() {
        Produktlager produktlager = new Produktlager();
        assertNull(produktlager.getMaxWeight());
    }

}