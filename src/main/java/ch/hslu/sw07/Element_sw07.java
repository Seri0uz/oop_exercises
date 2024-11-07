package ch.hslu.sw07;

import java.util.Objects;

public class Element_sw07 {
    private final float tempCelsius;
    private final float meltingPoint;
    private final float boilingPoint;

    protected Element_sw07(float tempCelsius, float meltingPoint, float boilingPoint) {
        this.tempCelsius = tempCelsius;
        this.meltingPoint = meltingPoint;
        this.boilingPoint = boilingPoint;
    }

    public float getTempCelsius() {
        return tempCelsius;
    }

    public float getMeltingPoint() {
        return meltingPoint;
    }

    public float getBoilingPoint() {
        return boilingPoint;
    }

    public String getAggregateState() {
        if (tempCelsius < meltingPoint) {
            return "fest";
        } else if (tempCelsius >= boilingPoint) {
            return "gasförmig";
        } else {
            return "flüssig";
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
        return (object instanceof Element_sw07 element)
                && (Float.compare(element.getTempCelsius(), tempCelsius) == 0)
                && (Float.compare(element.meltingPoint, meltingPoint) == 0)
                && (Float.compare(element.boilingPoint, boilingPoint) == 0);
    }

    @Override
    public final int hashCode() {
        return Objects.hash(tempCelsius, meltingPoint, boilingPoint);
    }
}
