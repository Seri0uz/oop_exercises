package ch.hslu.sw06;

public abstract class Shape_sw06 {
    private int x;
    private int y;


    protected Shape_sw06(final int x, final int y) {
        this.x = x;
        this.y = y;
    }
    public final void move(final int newX,final int newY) {
        this.x = x;
        this.y = y;
    }
    public final int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public abstract double getPerimeter();
    public abstract double getArea();

    public static void main(final String[] args) {
        Shape_sw06 shape1 = new Circle_sw06(5, 6, 13);
        Shape_sw06 shape2 = new Rectangle_sw06(4, 8, 12, 9);
        shape1.move(5, 6);
        shape2.move(4, 8);
        ((Circle_sw06) shape1).getDiameter();
    }
}

