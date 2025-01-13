package ch.hslu.FS20;

import ch.hslu.demo.Antrieb;

import java.util.HashMap;
import java.util.Map;

public final class RasenmäherLager {
    private Map<String,Rasenmäher> rasenmähers = new HashMap<>();
    public RasenmäherLager() {
        Rasenmäher rasenmäher1 = new RasenmäherTypeA(new Antrieb());
        Rasenmäher rasenmäher2 = new RasenmäherTypeB(new Antrieb());
        Rasenmäher rasenmäher3 = new RasenmäherTypeA(new Antrieb());
        rasenmähers.put(rasenmäher1.getSerialNumber(),rasenmäher1);
        rasenmähers.put(rasenmäher2.getSerialNumber(),rasenmäher2);
        rasenmähers.put(rasenmäher3.getSerialNumber(),rasenmäher3);

        for (Rasenmäher rasenmäher : rasenmähers.values()) {
            System.out.println(rasenmäher.toString());
        }
    }
    public int getRasenmäherTypeCount(Generation generation) {
        int count = 0;
        for (Rasenmäher rasenmäher : rasenmähers.values()) {
            if (generation == rasenmäher.getGeneration())
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        RasenmäherLager rasenmäherLager = new RasenmäherLager();
    }
}
