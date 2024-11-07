package ch.hslu.sw05;
/**
 * @author Samuel Duss
 */
public class Element {
    private final float tempCelsius;
    private final float meltingPoint;
    private final float boilingPoint;
    protected Element(float meltingPoint, float boilingPoint) {
        this.tempCelsius = 20f;
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
}
