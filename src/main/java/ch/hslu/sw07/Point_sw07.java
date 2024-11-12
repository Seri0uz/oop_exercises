package ch.hslu.sw07;

import ch.hslu.demo.Point;

import java.util.Objects;

public class Point_sw07 implements Comparable<Point_sw07> {
    private int x;
    private int y;

    public Point_sw07(int x,int y)
    {
        // Instanzvariable initialisieren
        this.x = x;
        this.y = y;
    }

    public Point_sw07(Point point)
    {
        this.x = point.getX();
        this.y = point.getY();
    }

    public int getX()
    {
        // tragen Sie hier den Code ein
        return this.x;
    }

    public int getY()
    {
        // tragen Sie hier den Code ein
        return this.y;
    }

    public void setX(int setX)
    {
        this.x = setX;
    }

    public void setY(int setY)
    {
        this.y = setY;
    }

    public String getQuadrant()
    {
        if (x > 0 && y > 0)
        {
            return "Quadrant rechts oben";
        }
        else if (x > 0 && y < 0)
        {
            return "Quadrant rechts unten";
        }
        else if (x < 0 && y > 0)
        {
            return "Quadrant links oben";
        }
        else if (x == 0)
        {
            return "Punkt liegt auf der x-Achse";
        }
        else if (y == 0)
        {
            return "Punkt liegt auf der y-Achse";
        }
        else
        {
            return "Quadrant links unten";
        }
    }

    public int getQuadrantSolved()
    {
        int quadrant = 0;
        if (x > 0 && y > 0) {
            quadrant = 1;
        }
        else if (x < 0 && y > 0 ) {
            quadrant = 2;
        }
        else if (x > 0 && y < 0) {
            quadrant = 3;
        }
        else if (x < 0 && y < 0) {
            quadrant = 4;
        }
        else if (x == 0 && y != 0) {
            System.out.print("Der Punkt liegt auf der X-Achse");
        }
        else if (x != 0 && y == 0) {
            System.out.print("Der Punkt liegt auf der Y-Achse");
        }
        else {
            System.out.print("Der Punkt liegt am Nullpunkt");
        }
        return quadrant;
    }
    public void moveRelative(int x,int y)
    {
        this.x = x + this.x;
        this.y = y + this.y;
    }
    public void moveRelative(Point point)
    {
        this.x = point.getX();
        this.y = point.getY();
    }
    public void moveRelative(double angle, double amount)
    {
        this.x += (int) amount * Math.cos(angle);
        this.y += (int) amount * Math.sin(angle);
    }

    @Override
    public String toString() {
        return "x" + x + "y" + y;
    }

    @Override
    public final boolean equals(Object object) {
        if (this == object)
            return true;
        return (object instanceof Point_sw07 point)
                && (this.x == point.x)
                && (this.y == point.y);
    }

    @Override
    public final int hashCode() {
        return Objects.hash(x,y);
    }

    @Override
    public int compareTo(Point_sw07 point) {
        int compare = Integer.compare(this.x,this.x);
        if (compare == 0) {
            compare = Integer.compare(point.y,this.y);
        }
        return compare;

    }
    public static void main(String[] args) {
        Point p = new Point(1,3);
        System.out.println(p);
    }
}
