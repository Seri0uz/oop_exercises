package ch.hslu.sw06;

import ch.hslu.demo.Point;

public class Point_sw06
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int x;
    private int y;

    public Point_sw06(int x,int y)
    {
        // Instanzvariable initialisieren
        this.x = x;
        this.y = y;
    }

    public Point_sw06(Point point)
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
}
