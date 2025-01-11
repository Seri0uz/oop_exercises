package ch.hslu.demo;

import java.util.Objects;

public final class Staubsauger implements Weightable{
    private final Motor motor;
    private String model;
    private double weight;

    public Staubsauger(String model) {
        if (validateModel(model))
            throw new IllegalArgumentException("Invalid model");
        this.motor = new Motor();
        this.model = model;
    }

    public Staubsauger(String model, String motor) {
        if (validateModel(model))
            throw new IllegalArgumentException("Invalid model");
        this.motor = new Motor(motor);
        this.model = model;
    }

    public Staubsauger(double weight, String model) {
        if (validateModel(model))
            throw new IllegalArgumentException("Invalid model");
        this.model = model;
        this.motor = new Motor();
        this.weight = weight;
    }

    public Motor getMotor() {
        return motor;
    }

    public String getModel() {
        return model;
    }

    public boolean validateModel(String model) {
        return model == null || model.isEmpty() || model.length() > 17;
    }

    public double getWeight() {
        if (this.weight < 0.01 || this.weight > 2000) {
            throw new IllegalArgumentException("Invalid weight");
        }
        return weight;
    }

    @Override
    public String toString() {
        return "Staubsauger: motor=" + motor + ", model=" + model;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        return (obj instanceof Staubsauger)
                && Objects.equals(((Staubsauger) obj).motor, motor)
                && Objects.equals(((Staubsauger) obj).model, model)
                && Objects.equals(((Staubsauger) obj).weight, weight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(motor, model, weight);
    }
}
