package ch.hslu.sw11;


public class Messpunkte {

    public void getMesspunkte() {
        TemperaturRead temperaturRead = new TemperaturRead();
        String TXT_FILE = "E:/netatmo-export-202301-202304.csv";
        TemperaturVerlauf temperaturVerlauf = temperaturRead.readTemperaturFromCSV(TXT_FILE);
        System.out.println(temperaturVerlauf);
    }


    public static void main(final String[] args) {
        Messpunkte messpunkte = new Messpunkte();
        messpunkte.getMesspunkte();
    }
}
