package ch.hslu.sw12;

import java.util.Objects;

public final class Temperatur implements Comparable<Temperatur> {
    public static final float KELVIN_OFFSET = 273.15f;
    private float kelvin;
    private float celsius;

    public Temperatur(float kelvin) {
        this.kelvin = kelvin;
        this.celsius = convertKelvinToCelsius(kelvin);
    }

    public Temperatur(Temperatur temperatur) {
        this.kelvin = temperatur.kelvin;
        this.celsius = convertKelvinToCelsius(temperatur.kelvin);
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
     * Sets the temperature in Celsius by converting the Celsius value to Kelvin.
     *
     * @param celsius the temperature in Celsius to set.
     */
    public void setCelsius(float celsius) {
        this.kelvin = convertKelvinToCelsius(celsius);
    }

    /**
     * Sets the temperature in Kelvin.
     *
     * @param kelvin the temperature value in Kelvin to set.
     */
    public void setKelvin(float kelvin) {
        this.kelvin = kelvin;
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


    @Override
    public String toString() {
        return "Kelvin " + kelvin;
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
