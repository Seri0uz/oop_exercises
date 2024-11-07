package ch.hslu.sw03;

import ch.hslu.sw02.Temperatur;

/**
 * Beschreiben Sie hier die Klasse Demo.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Demo
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen

    /**
     * Konstruktor für Objekte der Klasse Demo
     */
    public Demo()
    {
        // Instanzvariable initialisieren
    }

    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    public void forIteration()
    {
        for (int i = 0; i <=10; i++)
        {
            System.out.print(i);
        }// tragen Sie hier den Code ein
        
    }
    
    public void doWhileIteration()
    {
        int i = 0;
        do {
            System.out.print(i);
            i++;
        }
        while (i<=10);   
    }
    
    public void whileIteration()
    {
        int i = 0;
        while (i<=10)  {
            System.out.print(i);
            i++; 
        }
    }
    
    public float whileFloatIteration()
    {
        int counter = 0;
        float i = 0.9f;
        while (i <= 1.0f) {
            i = i + 0.000025f;
            counter ++;
        }
        System.out.print("Number of iterations:"+ counter);
        return i;
    }
    
    public float forFloatIteration()
    {
        float i = 0.9f;
        for (int counter = 0; counter <=4000; counter ++)
        {
            i = i+0.000025f;
        }
        return i;
    }
    
    public void printBox(int width, int height)
    {
       //First line
        for (int i = 1; i<=width; i++)
        {
            System.out.print("#");
        }
        System.out.println();
        
        // Side lines
        for (int i = 3; i<=height; i++)
        {
            System.out.print("#");
            for(int j = 3; j<=width; j++)
            {
                System.out.print(" ");
                
            }
            System.out.print("#");
            System.out.println();
        }
        
        // Last line
        for (int i = 1; i<=width; i++)
        {
            System.out.print("#");
        }
    }
    
    public void printSwissCross(int scaling)
    {
        int height = scaling;
        int width = scaling * 2;
        int widthMax = width * 3;
        
        for (int i = 1; i<=height; i++)
        {
            for (int j = 1; j<=width; j++)
            {
                System.out.print(" ");
            }
            for (int k = 1; k<=width; k++)
            {
                System.out.print("#");
            }
            System.out.println();
        }
        for (int i = 1; i<=height; i++)
        {
            for (int j = 1; j<=widthMax; j++)
            {
                System.out.print("#");
            }
            System.out.println();
        }
        for (int i = 1; i<=height; i++)
        {
            for (int j = 1; j<=width; j++)
            {
                System.out.print(" ");
            }
            for (int k = 1; k<=width; k++)
            {
                System.out.print("#");
            }
            System.out.println();
        }
    }
    public static void main(final String[] args) {
        Demo demo = new Demo();
        demo.forIteration();
        demo.printSwissCross(9);
        demo.printSwissCross(8);
        demo.whileIteration();
        demo.forFloatIteration();
        demo.whileFloatIteration();
    }
}
