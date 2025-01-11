package ch.hslu.sw11;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public final class TemperaturRead {
    private static final Logger LOG =
            LoggerFactory.getLogger(TemperaturRead.class);


    public TemperaturVerlauf readTemperaturFromCSV(String txtFile) {
        TemperaturVerlauf temperaturVerlauf = new TemperaturVerlauf();
        if (new File(txtFile).exists()) {
            try (final DataInputStream dis = new DataInputStream(new FileInputStream(txtFile))) {
                while (dis.available() > 0) {
                    String[] values = dis.readLine().split(";");
                    String timeStampAsString = values[1];
                    LocalDateTime timestamp = LocalDateTime.parse(timeStampAsString, DateTimeFormatter.ofPattern("\"yyyy/MM/dd HH:mm:ss\""));
                    String temperatureString = values[2];
                    float temperature = Float.parseFloat(temperatureString);
                    LOG.info("Timestamp: {}, Temperature: {}", timestamp, temperature);
                    Temperatur temperatur = Temperatur.createFromCelsius(temperature,timestamp);
                    temperaturVerlauf.add(temperatur);
                }
                return temperaturVerlauf;

            } catch (IOException e) {
                LOG.error(e.getMessage(), e);
            }
        }
        return null;
    }
    public static void main(final String[] args) {
        TemperaturRead temperaturRead = new TemperaturRead();
        temperaturRead.readTemperaturFromCSV("E:/netatmo-export-202301-202304.csv");
    }
}
