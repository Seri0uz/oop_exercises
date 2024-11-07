package ch.hslu.sw02;

import ch.hslu.demo.Point;

/**
 * Beschreiben Sie hier die Klasse Temperatur.
 * 
 * @author Samuel Duss
 * @version SW02: Klassen und Datentypen
 */
public class Temperatur
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private double tempCelsius;

    /**
     * Konstruktor für Objekte der Klasse Temperatur
     */
    public Temperatur()
    {
        // Instanzvariable initialisieren
        tempCelsius = 20;
    }

    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    public double getTempCelsius()
    {
        // tragen Sie hier den Code ein
        return tempCelsius;
    }
    
    public double getTempKelvin()
    {
        double tempkelvin = tempCelsius + 273.15;
        return tempkelvin;
    }
    
    public double getTempFahrenheit()
    {
        double tempfahrenheit = tempCelsius * 1.8 + 32;
        return tempfahrenheit;
    }
    
    public double setTempCelsius(double tempchange)
    {
        tempCelsius = tempCelsius + tempchange;
        return tempCelsius;
    }
    public static void main(final String[] args) {
        Temperatur temperature = new Temperatur();
        System.out.println(temperature.setTempCelsius(40));
        System.out.println("Celsius: " + temperature.getTempCelsius());
        System.out.println("Kelvin: " + temperature.getTempKelvin());
        System.out.println("Fahrenheit: " +temperature.getTempFahrenheit());
    }
}
