package ch.hslu.sw04;

/**
 * Beschreiben Sie hier die Klasse Motor.
 * 
 * @author Samuel Duss
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Lights implements Switchable
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int lumen;
    private boolean isOn;

    /**
     * Konstruktor für Objekte der Klasse Motor
     */
    public Lights()
    {
        this.lumen = 0;
        this.isOn = false;
    }

    /**
     *
     */
    public void switchOn()
    {
        if(this.isOn){
            System.out.print("Die Lichter sind bereits angeschaltet");
        
        }
        else{
            this.isOn = true;
            this.lumen = 3000;
            System.out.print("Die Lichter werden angeschaltet");
        }
    }
    
    public void switchOff()
    {
        if(!this.isOn){
            System.out.print("Die Lichter sind bereits abgeschaltet");
        }
        else {
            this.isOn = false;
            this.lumen = 0;
            System.out.print("Die Lichter werden gelöscht");
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