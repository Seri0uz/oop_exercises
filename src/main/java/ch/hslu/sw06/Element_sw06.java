package ch.hslu.sw06;

public class Element_sw06 {

    private final float tempCelsius;
    private final float meltingPoint;
    private final float boilingPoint;

    protected Element_sw06(float meltingPoint, float boilingPoint) {
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
        if (tempCelsius<meltingPoint){
            return "fest";
        }
        else if (tempCelsius>=boilingPoint) {
            return "gasförmig";
        }
        else {
            return "flüssig";
        }

    }
    @Override
    public String toString() {
        return "Temperatur des Elements in Celsius" + tempCelsius + "   Schmelzpunkt des Elements in Celsius" + meltingPoint + "   Siedepunkt des Elements in Celsius" + boilingPoint;
    }
}
