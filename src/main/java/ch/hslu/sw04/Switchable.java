package ch.hslu.sw04;

/**
 * Schnittstelle welche einen Schalter ein- oder ausschaltet bzw. den Zustand kontrolliert.
 * 
 * @author Samuel Duss
 * @version SW04A2
 */

public interface Switchable
{
    /**
    * Schaltet den Schalter ein.
    * 
    */
    void switchOn();
    
    /**
    * Schaltet den Schalter aus.
    * 
    */
    void switchOff();
    
    /**
    * Überprüft ob der Schalter eingeschaltet ist.
    * 
    * @return   true
    *           Gibt den Wert true zurück, falls Schalter eingeschaltet ist. 
    */
    boolean isSwitchedOn();
    
    /**
    * Überprüft ob der Schalter ausgeschaltet ist.
    * 
    * @return   true
    *           Gibt den Wert true zurück, falls Schalter ausgeschaltet ist. 
    */
    boolean isSwitchedOff();
}
