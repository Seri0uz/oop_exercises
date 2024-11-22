package ch.hslu.sw10;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class Prompt {
    private static final Logger LOG =
            LoggerFactory.getLogger(Prompt.class);

    public static void main(String[] args) {
        TemperaturVerlauf temperaturVerlauf = new TemperaturVerlauf();

        temperaturVerlauf.addPropertyChangeListenerMax(event -> LOG.info("Maximale Temperatur wurde geändert von: {} zu {}", event.getOldValue(), event.getNewValue()));
        temperaturVerlauf.addPropertyChangeListenerMin(event -> LOG.info("Minimale Temperatur wurde geändert von: {} zu {}", event.getOldValue(), event.getNewValue()));
        String input;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Bitte Temperatur in Celsius eingeben (oder 'exit' zum Beenden): ");
            input = scanner.next();
            try {
                if (!"exit".equals(input)) {
                    float value = Float.parseFloat(input);
                    temperaturVerlauf.add(Temperatur.createFromCelsius(value));
                    LOG.info("Temperatur in Celsius = {}", value);
                    LOG.info("Temperatur in Kelvin = {}",Temperatur.convertCelsiusToKelvin(value));
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
        System.out.println("Temperatur Statistik: " + temperaturVerlauf);
        System.out.println("Programm beendet.");
    }
}