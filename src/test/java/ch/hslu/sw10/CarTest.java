package ch.hslu.sw10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void switchOn() {
        Engine engine = new Engine();
        engine.switchOn();
//
//        assertEquals();
    }

    @Test
    void switchOff() {
        Car car = new Car();
        car.switchOff();
    }
}