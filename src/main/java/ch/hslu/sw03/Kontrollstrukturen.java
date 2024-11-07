package ch.hslu.sw03;

/**
 * Beschreiben Sie hier die Klasse Kontrollstrukturen.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Kontrollstrukturen
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int x;

    /**
     * Konstruktor für Objekte der Klasse Kontrollstrukturen
     */
    public Kontrollstrukturen()
    {
        // Instanzvariable initialisieren
        x = 0;
    }

    public int max(int a,int b)
    {
        return Math.max(a, b);
    }

    public int min(int a,int b)
    {
        return Math.min(a, b);
    }

    public int max1(int a, int b, int c)
    {
        return Math.max(Math.max(b, c),a);
    }
    
    public int max2(int a, int b, int c)
    {
        return max(a, max(b, c));
    }

    public static void main(final String[] args) {
        Kontrollstrukturen kontrollstrukturen = new Kontrollstrukturen();
        kontrollstrukturen.max(5,6);
        kontrollstrukturen.min(5,6);
        System.out.println(kontrollstrukturen.max1(5,6,7));
        System.out.println(kontrollstrukturen.max2(5,4,5));
    }
}
