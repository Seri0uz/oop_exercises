package ch.hslu.sw08;

public final class Rectangle_sw08 extends Shape_sw08 {
    private double width;
    private double height;

    public Rectangle_sw08(final int x, final int y, final double width, final double height) {
        super(x,y);
        this.width = width;
        this.height = height;
    }
    public double getWidth() {
        return width;
    }
    public double getHeight() {
        return height;
    }
    public void changeDimension(final double newWidth, final double newHeight) {
        this.width = newWidth;
        this.height = newHeight;
    }
    @Override
    public double getPerimeter() {
        return (width + height) * 2;
    }
    public double getArea() {
        return width * height;
    }
}
