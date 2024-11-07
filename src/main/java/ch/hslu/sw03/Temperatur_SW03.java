package ch.hslu.sw03;

/**
 * Die Klasse berechnet Temperaturen in verschiedene Einheiten um und gibt den Aggregatszustand 
 * von den Elementen Stickstoff (N), Quecksilber (Hg) und Blei (Pb) an
 * 
 * @author Samuel Duss
 * @version SW03:Kontrollstrukturen
 */
public class Temperatur_SW03
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private float tempCelsius;

    /**
     * Konstruktor für Objekte der Klasse Temperatur
     */
    public Temperatur_SW03()
    {
        /**
        * Standardwert der Temperatur, mit welcher umgerechnet wird
        * 
        */
        tempCelsius = 20f;
    }

    /**
    * Gibt Temperatur in Celsius zurück
    * 
    *         
    * @return  tempCelsius
    */
    public float getTempCelsius()
    {
        return tempCelsius;
    }
    
    /**
    * Rechnet Celsius in Kelvin um
    * 
    *         
    * @return  tempKelvin
    */
    public float getTempKelvin()
    {
        return tempCelsius + 273.15f;
    }
    
    /**
    * Rechnet Celsius in Fahrenheit um
    * 
    *         
    * @return  tempFahrenheit
    */
    public float getTempFahrenheit()
    {
        return tempCelsius + 273.15f;
    }
    
    /**
    * Verändert die Temperatur in Celsius 
    * 
    *         
    * @return  tempCelsius
    */
    public float setTempCelsius(float tempChange)
    {
        tempCelsius = tempCelsius + tempChange;
        return tempCelsius;
    }
    
    /**
    * Wertet das ausgewählte Element aus und übergibt Schmelzpunkt und Siedepunkt and Methode {@code getAggreagtionState}
    * 
    * @param   element   
    *          Das Element für welches der Aggregatzustand ermittelt werden soll
    *          (N,Hg,Pb)
    *         
    * @return  aggregate
    *          Der Aggregatzustand des Elements bei Temperatur {@code tempCelsius} 
    */
    public String getAggregationStateofElement(String element){
        String aggregate = "";
        
        switch (element){
           case "N": 
               aggregate = getAggregationState(-210f,-196f);
               break;
           case "Hg": 
               aggregate = getAggregationState(-39f,357f);
               break;
           case "Pb": 
               aggregate = getAggregationState(327f,1749f); 
               break;
           default: 
               aggregate = ("Angegebenes Element ist nicht vorhanden");
               break;
           
        };
        return aggregate;
    }
    
    /**
    * Vergleicht den Schmelzpunkt mit dem Siedepunkt und gibt den Aggregatzustand zurück
    * 
    * @param   meltingPoint
    *            
    * @param   boilingPoint
    *         
    * @return  "Aggregatszustand des Elements"
    */
    public String getAggregationState (float meltingPoint, float boilingPoint){
        if (tempCelsius<meltingPoint){
            return "fest";         
        }
        else if (tempCelsius>=boilingPoint) {
            return "gasförmig";
        }
        else{
            return "flüssig";
        }
    }
    public static void main(final String[] args) {
        Temperatur_SW03 temperatur_sw03 = new Temperatur_SW03();
        temperatur_sw03.setTempCelsius(210f);
        System.out.println(temperatur_sw03.getAggregationStateofElement("N"));
    }
}
