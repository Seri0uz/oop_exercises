package ch.hslu.repetition;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Demo {
    private final RaumVerwaltung raumVerwaltung = new RaumVerwaltung();

    private static final Logger LOG =
            LoggerFactory.getLogger(Demo.class);

    public Demo(){
        this.raumVerwaltung.addListener(this::handleTemperaturEvents);
    }

    public void handleTemperaturEvents(RaumEvent event) {
        LOG.info(
                "room {} with new state {}, capacity is {}",
                event.getRaum(),
                event.getState(),
                event.getCapacity()

        );
    }

    public void bookRaum() {
        raumVerwaltung.bookRaum(11);
        raumVerwaltung.bookRaum(6);
        raumVerwaltung.bookRaum(17);
        System.out.println(raumVerwaltung);
    }

    public static void main(final String[] args) {
        Demo demo = new Demo();
        demo.bookRaum();
    }
}
