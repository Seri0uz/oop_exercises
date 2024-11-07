package ch.hslu.sw05;

import ch.hslu.sw03.Demo;

public abstract class Shape {
    private int x;
    private int y;

    protected Shape(final int x, final int y) {
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

}

