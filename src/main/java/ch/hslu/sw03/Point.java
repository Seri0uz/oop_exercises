package ch.hslu.sw03;

/**
 * Beschreiben Sie hier die Klasse Point.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Point
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int x;
    private int y;

    public Point()
    {
        // Instanzvariable initialisieren
        x = -2;
        y = 4;
    }

    public int getX()
    {
        // tragen Sie hier den Code ein
        return x;
    }
    
    public int getY()
    {
        // tragen Sie hier den Code ein
        return y;
    }
    
    public void setX(int setX)
    {
        x = setX;
    }
    
        public void setY(int setY)
    {
        y = setY;
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
    public static void main(final String[] args) {
        Point point = new Point();
        point.getQuadrantSolved();
    }
}

