package ch.hslu.demo;

import java.util.Objects;

public abstract class Rasenmäher implements Comparable<Rasenmäher> {
    private final Antrieb antrieb;
    private Messer messer;
    private final String serialNumber;
    public static int COUNTER = 20000;
    private Generation generation;

    public Rasenmäher(Antrieb antrieb,Generation generation) {
        this.messer = new Messer();
        if (!this.messer.isCompatibleTo(generation))
            throw new IllegalArgumentException("Messer is not compatible to generation");
        this.antrieb = antrieb;
        this.serialNumber = this.addSerialNumber();
        this.generation = generation;
    }

    public Antrieb getAntrieb() {
        return antrieb;
    }
    public Messer getMesser() {
        return messer;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String addSerialNumber() {
        return "SV" + COUNTER++;
    }

    public Generation getGeneration() {
        return generation;
    }

    @Override
    public String toString() {
        return "antrieb: " + antrieb.toString() + "messer: " + messer.toString() + "serialNumber: " + serialNumber + "generation: " + generation;
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o)
            return true;
        return (o instanceof Rasenmäher rasenmäher)
                && Objects.equals(this.serialNumber, rasenmäher.serialNumber)
                && Objects.equals(this.antrieb,rasenmäher.antrieb)
                && Objects.equals(this.messer,rasenmäher.messer)
                && Objects.equals(this.generation,rasenmäher.generation);
    }

    @Override
    public final int hashCode() {
        return Objects.hash(serialNumber,antrieb,messer,generation);
    }

    @Override
    public int compareTo(Rasenmäher rasenmäher) {
        return this.getSerialNumber().compareTo(rasenmäher.getSerialNumber());
    }
}
