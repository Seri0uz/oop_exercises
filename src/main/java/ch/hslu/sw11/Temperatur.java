package ch.hslu.sw11;

import java.time.LocalDateTime;
import java.util.Objects;

public final class Temperatur implements Comparable<Temperatur> {
    public static final float KELVIN_OFFSET = 273.15f;
    private final float kelvin;
    private final float celsius;
    private final LocalDateTime dateTime;

    public Temperatur(Temperatur temperatur) {
        this.kelvin = temperatur.kelvin;
        this.celsius = temperatur.celsius;
        this.dateTime = temperatur.dateTime;
    }

    public Temperatur(float kelvin, LocalDateTime dateTime) {
        this.kelvin = kelvin;
        this.celsius = convertKelvinToCelsius(kelvin);
        this.dateTime = dateTime;
    }


    /**
     * Returns the temperature in Celsius.
     *
     * @return the temperature converted to Celsius.
     */
    public float getCelsius() {
        return this.celsius;
    }

    /**
     * Returns the temperature in Kelvin.
     *
     * @return the temperature in Kelvin.
     */
    public float getKelvin() {
        return this.kelvin;
    }

    /**
     * Converts a temperature from Kelvin to Celsius.
     *
     * @param kelvin the temperature in Kelvin.
     * @return the converted temperature in Celsius.
     */
    public static float convertKelvinToCelsius(float kelvin) {
        return kelvin - KELVIN_OFFSET;
    }

    /**
     * Converts a temperature from Celsius to Kelvin.
     *
     * @param celsius the temperature in Celsius.
     * @return the converted temperature in Kelvin.
     */
    public static float convertCelsiusToKelvin(float celsius) {
        return celsius + KELVIN_OFFSET;
    }

    public static Temperatur createFromKelvin(final float kelvin, final LocalDateTime dateTime) {
        if (validateIllegalKelvin(kelvin)) {
            throw new IllegalArgumentException("Temperature has to be over 0 Kelvin");
        }
        return new Temperatur(kelvin, dateTime);
    }

    public static Temperatur createFromCelsius(final float celsius, final LocalDateTime dateTime) {
        if (validateIllegalCelsius(celsius)) {
            throw new IllegalArgumentException("Temperature has to be over -273.15 Celsius");
        }
        return createFromKelvin(convertCelsiusToKelvin(celsius),dateTime);
    }


    public static boolean validateIllegalKelvin(float kelvin) {
        return kelvin <0.0f;
    }

    public static boolean validateIllegalCelsius(float celsius) {
        return celsius < -273.15f;
    }

    @Override
    public String toString() {
        return "Kelvin " + kelvin + ", Celsius " + celsius + ", Date " + dateTime;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object)
            return true;
        return (object instanceof Temperatur temperatur)
                && (Float.compare(this.kelvin, temperatur.kelvin) == 0);

    }

    @Override
    public int hashCode() {
        return Objects.hash(kelvin);
    }

    @Override
    public int compareTo(Temperatur temperatur) {
        return Float.compare(this.kelvin, temperatur.kelvin);
    }

}
