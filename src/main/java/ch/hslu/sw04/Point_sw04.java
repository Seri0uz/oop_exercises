package ch.hslu.sw04;

/**
 * Beschreiben Sie hier die Klasse Point.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Point_sw04
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int x;
    private int y;

    public Point_sw04(int x,int y)
    {
        // Instanzvariable initialisieren
        this.x = x;
        this.y = y;
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
    
}

