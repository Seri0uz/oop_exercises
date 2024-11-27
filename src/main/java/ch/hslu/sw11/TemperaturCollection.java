package ch.hslu.sw11;


public interface TemperaturCollection {
    /**
     * Adds a temperature record to the collection.
     *
     * @param temperatur the Temperatur_sw08 object to add.
     * @return true if the temperature was added; false if it was a duplicate.
     */
    boolean add(Temperatur temperatur);

    /**
     * Clears all temperature records from the collection.
     */
    void clear();

    /**
     * Gets the total count of temperature records in the collection.
     *
     * @return the number of temperature records.
     */
    int getCount();

    /**
     * Finds and returns the maximum temperature in the collection.
     *
     * @return the Temperatur_sw08 object with the maximum temperature,
     *         or null if the collection is empty.
     */
    Temperatur getMax();

    /**
     * Finds and returns the minimum temperature in the collection.
     *
     * @return the Temperatur_sw08 object with the minimum temperature,
     *         or null if the collection is empty.
     */
    Temperatur getMin();

    /**
     * Calculates and returns the average temperature of the collection.
     *
     * @return a new Temperatur_sw08 object representing the average temperature
     *         in Kelvin, or null if the collection is empty.
     */
    Temperatur getAverage();


}
