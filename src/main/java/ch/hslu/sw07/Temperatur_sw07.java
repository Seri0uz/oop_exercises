package ch.hslu.sw07;

import java.util.Objects;

public class Temperatur_sw07 implements Comparable<Temperatur_sw07> {
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private float tempCelsius;

    /**
     * Konstruktor für Objekte der Klasse Temperatur.
     */
    public Temperatur_sw07(float tempCelsius)
    {
        /**
         * Standardwert der Temperatur, mit welcher umgerechnet wird.
         *
         */
        this.tempCelsius = tempCelsius;
    }

    /**
     * Gibt Temperatur in Celsius zurück.
     *
     *
     * @return  tempCelsius
     */
    public float getTempCelsius()
    {
        return tempCelsius;
    }

    /**
     * Rechnet Celsius in Kelvin um.
     *
     *
     * @return  tempKelvin
     */
    public float getTempKelvin()
    {
        return tempCelsius + 273.15f;
    }

    /**
     * Rechnet Celsius in Fahrenheit um.
     *
     *
     * @return  tempFahrenheit
     */
    public float getTempFahrenheit()
    {
        return tempCelsius + 273.15f;
    }

    /**
     * Verändert die Temperatur in Celsius.
     *
     *
     * @return  tempCelsius
     */
    public float setTempCelsius(float tempChange)
    {
        tempCelsius = tempCelsius + tempChange;
        return tempCelsius;
    }


    @Override
    public String toString() {
        return "TempCelsius" + tempCelsius ;
    }

    @Override
    public final boolean equals(Object object) {
        if (this == object)
            return true;
        return (object instanceof Temperatur_sw07 temperatur)
                && (Float.compare(temperatur.tempCelsius, tempCelsius) == 0);

    }

    @Override
    public final int hashCode() {
        return Objects.hash(tempCelsius);
    }

    @Override
    public int compareTo(Temperatur_sw07 temperatur) {
        return Float.compare(temperatur.tempCelsius, this.tempCelsius);
    }

}
