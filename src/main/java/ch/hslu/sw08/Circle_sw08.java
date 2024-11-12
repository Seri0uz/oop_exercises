package ch.hslu.sw08;

public final class Circle_sw08 extends Shape_sw08 {
    private double diameter;
    public Circle_sw08(final int x, final int y, final int diameter) {
        super(x, y);
        this.diameter = diameter;
    }
    public final void setDiameter (final int diameter) {
        this.diameter = diameter;
    }
    public final double getDiameter () {
        return diameter;
    }
    @Override
    public final double getPerimeter () {
        return diameter * Math.PI;
    }
    public final double getArea () {
        return Math.PI * Math.pow((diameter / 2),2);
    }
}
