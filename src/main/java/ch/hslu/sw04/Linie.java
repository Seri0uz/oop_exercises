package ch.hslu.sw04;

/**
 * Beschreiben Sie hier die Klasse Linie.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Linie
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int x1;
    private int x2;
    private int y1;
    private int y2;
    private Point_sw04 start;
    private Point_sw04 end;

    /**
     * Konstruktor für Objekte der Klasse Linie
     */
    public Linie()
    {
        // Instanzvariable initialisieren
        this.x1 = 0;
        this.x2 = 0;
        this.y1 = 0;
        this.y2 = 0;
        this.start = new Point_sw04(x1,y1);
        this.end = new Point_sw04(x2,y2);
    }
    
    public Point_sw04 getStart(){
        return start;
    }
    
    public Point_sw04 getEnd(){
        return end;
    }
    
    public void setStart(int x,int y){
        this.start.setX(x);
        this.start.setY(y);
    }
    
    public void setEnd(int x, int y){
        this.end.setX(x);
        this.end.setY(y);
    }
}
