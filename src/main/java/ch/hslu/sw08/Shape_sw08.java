package ch.hslu.sw08;

public abstract class Shape_sw08 {
    private int x;
    private int y;


    protected Shape_sw08(final int x, final int y) {
        this.x = x;
        this.y = y;
    }
    public final void move(final int newX,final int newY) {
        this.x = newX;
        this.y = newY;
    }
    public final int getX() {
        return x;
    }
    public final int getY() {
        return y;
    }
    public abstract double getPerimeter();
    public abstract double getArea();

    public static void main(final String[] args) {
        Shape_sw08 shape1 = new Circle_sw08(5, 6, 13);
        Shape_sw08 shape2 = new Rectangle_sw08(4, 8, 12, 9);
        shape1.move(5, 6);
        shape2.move(4, 8);
        ((Circle_sw08) shape1).getDiameter();
    }
}

