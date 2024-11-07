package ch.hslu.sw04;

import ch.hslu.sw03.Demo;

/**
 * Beschreiben Sie hier die Klasse Motor.
 * 
 * @author Samuel Duss
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Car implements Switchable
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private Engine engine;
    private Lights lights;
    private boolean isOn;

    /**
     * Konstruktor für Objekte der Klasse Motor
     */
    public Car()
    {
        engine = new Engine();
        lights = new Lights();
        this.isOn = false;
    }

    /**
     *
     */
    public void switchOn()
    {
        if(this.isOn){
            System.out.print("Das Fahrzeug läuft bereits");
        
        }
        else{
            this.isOn = true;
            engine.switchOn();
            lights.switchOn();
            System.out.print("Das Fahrzeug wird gestartet");
        }
    }
    
    public void switchOff()
    {
        if(!this.isOn){
            System.out.print("Das Fahrzeug ist bereits abgeschaltet");
        }
        else {
            this.isOn = false;
            engine.switchOff();
            lights.switchOff();
            System.out.print("Das Fahrzeug wird abgeschaltet");
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

    public static void main(final String[] args) {
        Car car = new Car();
        car.switchOn();
        car.switchOff();
        car.isSwitchedOn();
        car.switchOff();
    }
}