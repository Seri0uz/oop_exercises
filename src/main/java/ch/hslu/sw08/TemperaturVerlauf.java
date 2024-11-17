package ch.hslu.sw08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;


public class TemperaturVerlauf implements TemperaturCollection {
    final Set<Temperatur_sw08> temperatures = new HashSet<>() {
    };

    /**
     * Adds a temperature record to the collection.
     *
     * @param temperatur the Temperatur_sw08 object to add.
     * @return true if the temperature was added; false if it was a duplicate.
     */
    public final boolean add(final Temperatur_sw08 temperatur) {
        return this.temperatures.add(temperatur);
    }

    /**
     * Clears all temperature records from the collection.
     */
    public final void clear() {
        this.temperatures.clear();
    }

    /**
     * Gets the total count of temperature records in the collection.
     *
     * @return the number of temperature records.
     */
    public final int getCount() {
        return this.temperatures.size();
    }

    /**
     * Finds and returns the maximum temperature in the collection.
     *
     * @return the Temperatur_sw08 object with the maximum temperature,
     *         or null if the collection is empty.
     */
    public final Temperatur_sw08 getMax() {
        if (temperatures.isEmpty())
            return null;
        return new Temperatur_sw08(Collections.max(temperatures));
    }

    /**
     * Finds and returns the minimum temperature in the collection.
     *
     * @return the Temperatur_sw08 object with the minimum temperature,
     *         or null if the collection is empty.
     */
    public final Temperatur_sw08 getMin() {
        if (temperatures.isEmpty())
            return null;
        return new Temperatur_sw08(Collections.min(temperatures));
    }

    /**
     * Calculates and returns the average temperature of the collection.
     *
     * @return a new Temperatur_sw08 object representing the average temperature
     *         in Kelvin, or null if the collection is empty.
     */
    public final Temperatur_sw08 getAverage() {
        float tempSum = 0.0f;
        if (this.temperatures.isEmpty())
            return null;

        for (final Temperatur_sw08 temperatur : temperatures) {
            tempSum += temperatur.getKelvin();
        }
        float tempAverage = tempSum / this.getCount();
        return new Temperatur_sw08(tempAverage);
    }

    public static void main(final String[] args) {
        TemperaturVerlauf temperaturVerlauf = new TemperaturVerlauf();
        temperaturVerlauf.add(new Temperatur_sw08(267));
        temperaturVerlauf.add(new Temperatur_sw08(267));
        temperaturVerlauf.add(new Temperatur_sw08(560));
    }

}
