package ch.hslu.sw09;
import java.util.Scanner;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class Prompt {
    private static final Logger LOG =
            LoggerFactory.getLogger(Prompt.class);
    public static void main(String[] args) {
        String input;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Bitte Temperatur eingeben (oder 'exit' zum Beenden): ");
            input = scanner.next();
            try {
                if (!"exit".equals(input)) {
                    float value = Float.parseFloat(input);
                    Temperatur_sw09 temp = Temperatur_sw09.createFromCelsius(value);
                    LOG.info("Temperatur in Celsius = {}",temp.getCelsius());
                    LOG.info("Temperatur in Kelvin = {}",temp.getKelvin());
                }
            }
            catch (NumberFormatException e) {
                System.out.println("Bitte eine korrekte Temperatur eingeben");
                LOG.error(e.getMessage());
            }
            catch (IllegalArgumentException e) {
                System.out.println("Die Temperatur darf nicht kleiner als -273.15Grad Celsius sein");
                LOG.error(e.getMessage());
            }
        } while (!"exit".equals(input));
        LOG.info("Programm wird beendet");
        System.out.println("Programm beendet.");
    }
}
