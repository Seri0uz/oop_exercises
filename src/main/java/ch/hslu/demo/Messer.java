package ch.hslu.demo;

import java.util.ArrayList;
import java.util.List;

public class Messer implements GenerationCompatible {
    private String klinge;
    private final List<Generation> generations = new ArrayList<>();

    public Messer(String klinge) {
        this.klinge = klinge;
        this.addCompatibleGenerations();
    }

    public Messer() {
        this.klinge = "gebogen";
        this.addCompatibleGenerations();
    }

    public String getKlinge() {
        return klinge;
    }

    public void setKlinge(String klinge) {
        this.klinge = klinge;
    }

    public void addCompatibleGenerations() {
        generations.add(Generation.G1);
        generations.add(Generation.G2);
    }

    @Override
    public boolean isCompatibleTo(Generation other) {
        return this.generations.contains(other);
    }

    @Override
    public String toString() {
        return "Messer[klinge=" + klinge + "]";
    }
}
