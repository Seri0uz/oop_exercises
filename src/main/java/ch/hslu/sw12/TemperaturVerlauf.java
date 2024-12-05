package ch.hslu.sw12;

import java.util.*;


public final class TemperaturVerlauf implements TemperaturCollection {
    final List<Temperatur> temperatures = new ArrayList<>();

    /**
     * Adds a temperature record to the collection.
     *
     * @param temperatur the Temperatur_sw08 object to add.
     * @return true if the temperature was added; false if it was a duplicate.
     */
    public boolean add(final Temperatur temperatur) {
        return this.temperatures.add(temperatur);
    }

    /**
     * Clears all temperature records from the collection.
     */
    public void clear() {
        this.temperatures.clear();
    }

    /**
     * Gets the total count of temperature records in the collection.
     *
     * @return the number of temperature records.
     */
    public int getCount() {
        return this.temperatures.size();
    }

    /**
     * Finds and returns the maximum temperature in the collection.
     *
     * @return the Temperatur_sw08 object with the maximum temperature,
     *         or null if the collection is empty.
     */
    public Temperatur getMax() {
        if (temperatures.isEmpty())
            return null;
        return new Temperatur(Collections.max(temperatures));
    }

    /**
     * Finds and returns the minimum temperature in the collection.
     *
     * @return the Temperatur_sw08 object with the minimum temperature,
     *         or null if the collection is empty.
     */
    public Temperatur getMin() {
        if (temperatures.isEmpty())
            return null;
        return new Temperatur(Collections.min(temperatures));
    }

    /**
     * Calculates and returns the average temperature of the collection.
     *
     * @return a new Temperatur_sw08 object representing the average temperature
     *         in Kelvin, or null if the collection is empty.
     */
    public Temperatur getAverage() {
        if (this.temperatures.isEmpty())
            return null;

        double tempAverage = temperatures.stream()
                .mapToDouble(Temperatur::getKelvin)
                .average()
                .getAsDouble();

        return new Temperatur((float) tempAverage);
    }

    public long countMinusTemperatur() {
        if (temperatures.isEmpty())
            return 0;

        return temperatures.stream().map(Temperatur::getCelsius).filter(temp -> temp < 0).count();
    }
    

    public static void main(final String[] args) {
        TemperaturVerlauf temperaturVerlauf = new TemperaturVerlauf();
        temperaturVerlauf.add(new Temperatur(267));
        temperaturVerlauf.add(new Temperatur(267));
        temperaturVerlauf.add(new Temperatur(560));
    }

}
