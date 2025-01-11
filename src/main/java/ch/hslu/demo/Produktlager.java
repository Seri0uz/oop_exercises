package ch.hslu.demo;

import java.util.HashMap;
import java.util.Map;

public class Produktlager {
    private final Map<String,Double> staubsaugers = new HashMap<>();
    public Produktlager() {
    }

    public void addStandardStaubsauger() {
        this.addProduktlager(new Staubsauger(6,"Typ1"));
        this.addProduktlager(new Staubsauger(11,"Typ2"));
        this.addProduktlager(new Staubsauger(14,"Typ3"));
    }


    public void addProduktlager(Staubsauger staubsauger) {
        staubsaugers.put(staubsauger.getModel(),staubsauger.getWeight());
    }

    public Staubsauger getTotalWeight() {
        double totalWeight = 0;
        if (this.staubsaugers.isEmpty())
            return null;
        for (double weight : staubsaugers.values()) {
            totalWeight += weight;

        }
        return new Staubsauger(totalWeight, "TotalWeight");
    }

    public Staubsauger getMaxWeight() {
        double maxWeight = 0;
        if (this.staubsaugers.isEmpty())
            return null;
        for(Map.Entry<String, Double> entry : staubsaugers.entrySet()) {
            if (maxWeight < entry.getValue()) {
                maxWeight = entry.getValue();
            }
        }
        return new Staubsauger(maxWeight,"MaxWeight");
    }
}
