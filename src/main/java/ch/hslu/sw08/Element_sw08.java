package ch.hslu.sw08;

import java.util.Objects;

public class Element_sw08 implements Comparable<Element_sw08> {
    private float tempCelsius;
    private final float meltingPoint;
    private final float boilingPoint;

    protected Element_sw08(float meltingPoint, float boilingPoint) {
        this.tempCelsius = 20f;
        this.meltingPoint = meltingPoint;
        this.boilingPoint = boilingPoint;
    }

    public float getTempCelsius() {
        return this.tempCelsius;
    }

    public void setTempCelsius(float tempCelsius) {
        this.tempCelsius = tempCelsius;
    }

    public float getMeltingPoint() {
        return meltingPoint;
    }

    public float getBoilingPoint() {
        return boilingPoint;
    }

    public String getAggregateState() {
        if (tempCelsius < meltingPoint) {
            return Aggregate.SOLID.getAggregate();
        } else if (tempCelsius >= boilingPoint) {
            return Aggregate.GAS.getAggregate();
        } else {
            return Aggregate.LIQUID.getAggregate();
        }

    }

    @Override
    public String toString() {
        return "Temperatur des Elements in Celsius" + tempCelsius + "   Schmelzpunkt des Elements in Celsius" + meltingPoint + "   Siedepunkt des Elements in Celsius" + boilingPoint;
    }

    @Override
    public final boolean equals(Object object) {
        if (this == object)
            return true;
        return (object instanceof Element_sw08 element)
                && (Float.compare(element.tempCelsius, tempCelsius) == 0)
                && (Float.compare(element.meltingPoint, meltingPoint) == 0)
                && (Float.compare(element.boilingPoint, boilingPoint) == 0);
    }

    @Override
    public final int hashCode() {
        return Objects.hash(tempCelsius, meltingPoint, boilingPoint);
    }

    @Override
    public int compareTo(Element_sw08 element) {
        return Float.compare(element.getTempCelsius(), tempCelsius);
    }

}
