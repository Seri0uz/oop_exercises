package ch.hslu.sw08;

public enum Aggregate {
    SOLID("fest"),LIQUID("flüssig"),GAS("gasförmig");

    private String aggregateName;

    Aggregate(String aggregate) {
        this.aggregateName = aggregate;
    }

    public String getAggregate() {
        return this.aggregateName;
    }
}
