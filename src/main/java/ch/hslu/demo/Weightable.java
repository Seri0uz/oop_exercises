package ch.hslu.demo;
/**
 * The {@code Weightable} interface defines a contract for objects that have a weight.
 * Classes implementing this interface should provide a concrete implementation of the
 * {@link #getWeight()} method to return the weight of the object.
 *
 * @author Samuel Duss
 * @version 1.0
 */

/**
 * Interface representing objects that have a measurable weight.
 */
public interface Weightable {

    /**
     * Returns the weight of the object in the range from 10g to 2t.
     *
     * @return the weight of the object as a double
     */
    double getWeight();
}
