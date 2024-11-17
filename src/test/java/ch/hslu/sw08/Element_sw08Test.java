package ch.hslu.sw08;

import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Element_sw08Test {

    @Test
    void equalsContract() {
        EqualsVerifier.forClass(Element_sw08.class).suppress(Warning.NONFINAL_FIELDS).verify();
    }

    @Test
    void getAggregateStateN() {
        N_sw08 n = new N_sw08();
        n.setTempCelsius(20);
        assertEquals("gasförmig",n.getAggregateState().getAggregate());
    }

    @Test
    void getAggregateStateHg() {
        Hg_sw08 hg = new Hg_sw08();
        hg.setTempCelsius(120);
        assertEquals("flüssig",hg.getAggregateState().getAggregate());
    }

    @Test
    void getAggregateStatePb() {
        Pb_sw08 pb = new Pb_sw08();
        pb.setTempCelsius(-15);
        assertEquals("fest",pb.getAggregateState().getAggregate());
    }
}