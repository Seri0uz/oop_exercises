package ch.hslu.demo;

import java.util.Objects;

public final class Motor {
    private String leistung;

    public Motor(String leistung) {
        this.leistung = leistung;
    }

    public Motor() {
        this.leistung = "High";
    }

    public String getLeistung() {
        return leistung;
    }
    public void setLeistung(String leistung) {
        this.leistung = leistung;
    }

    @Override
    public String toString() {
        return "Motorleistung:" + leistung;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        return (obj instanceof Motor)
                && Objects.equals(((Motor) obj).leistung, leistung);
    }

    @Override
    public int hashCode() {
        return Objects.hash(leistung);
    }
}
