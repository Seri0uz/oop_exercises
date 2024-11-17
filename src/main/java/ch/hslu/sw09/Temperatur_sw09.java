package ch.hslu.sw09;

import java.util.Objects;

public final class Temperatur_sw09 implements Comparable<Temperatur_sw09> {
    public static final float KELVIN_OFFSET = 273.15f;
    private final float kelvin;

    private Temperatur_sw09(float kelvin) {
        this.kelvin = kelvin;
    }

    public Temperatur_sw09(Temperatur_sw09 temperatur) {
        this.kelvin = temperatur.kelvin;
    }

    /**
     * Returns the temperature in Celsius.
     *
     * @return the temperature converted to Celsius.
     */
    public float getCelsius() {
        return convertKelvinToCelsius(kelvin);
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

    public static Temperatur_sw09 createFromKelvin(final float kelvin) {
        if (validateIllegalKelvin(kelvin)) {
            throw new IllegalArgumentException("Temperature has to be over 0 Kelvin");
        }
        return new Temperatur_sw09(kelvin);
    }

    public static Temperatur_sw09 createFromCelsius(final float celsius) {
        if (validateIllegalCelsius(celsius)) {
            throw new IllegalArgumentException("Temperature has to be over -273.15 Celsius");
        }
     return createFromKelvin(convertCelsiusToKelvin(celsius));
    }

    public static boolean validateIllegalKelvin(float kelvin) {
        return kelvin <0.0f;
    }

    public static boolean validateIllegalCelsius(float celsius) {
        return celsius < -273.15f;
    }

    @Override
    public String toString() {
        return "Kelvin " + kelvin;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object)
            return true;
        return (object instanceof Temperatur_sw09 temperatur)
                && (Float.compare(this.kelvin, temperatur.kelvin) == 0);

    }

    @Override
    public int hashCode() {
        return Objects.hash(kelvin);
    }

    @Override
    public int compareTo(Temperatur_sw09 temperatur) {
        return Float.compare(this.kelvin, temperatur.kelvin);
    }

}
