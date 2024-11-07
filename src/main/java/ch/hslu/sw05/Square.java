package ch.hslu.sw05;

public final class Square extends Shape{
    private double side;
    public Square(int x,int y,double side) {
        super(x,y);
        this.side = side;
    }
    public double getLength() {
        return side;
    }
    public void setLength(double side) {
        this.side = side;
    }
    @Override
    public double getArea() {
        return side*side;
    }
    public double getPerimeter() {
        return 4*side;
    }
}
