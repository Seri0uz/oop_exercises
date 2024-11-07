package ch.hslu.sw04;

/**
 * Beschreiben Sie hier die Klasse Engine.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Engine implements Switchable
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int rpm;
    private boolean isOn;

    /**
     * Konstruktor für Objekte der Klasse Motor
     */
    public Engine()
    {
        this.rpm = 0;
        this.isOn = false;
    }

    /**
     *
     */
    public void switchOn()
    {
        if(this.isOn){
            System.out.print("Der Motor läuft bereits");
        
        }
        else{
            this.isOn = true;
            this.rpm = 3600;
            System.out.print("Der Motor wird gestartet");
        }
    }
    
    public void switchOff()
    {
        if(!this.isOn){
            System.out.print("Der Motor ist bereits abgeschaltet");
        }
        else {
            this.isOn = false;
            this.rpm = 0;
            System.out.print("Der Motor wird abgeschaltet");
        }
    }
    
    public boolean isSwitchedOn()
    {
        return this.isOn;
    }
    
    public boolean isSwitchedOff()
    {
        return !this.isOn;
    }
}
