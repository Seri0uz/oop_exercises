package ch.hslu.demo;

public enum Generation {
    G1(2012),G2(2013),G3(2019);
    private int year;

    Generation(int year) {
        this.year = year;
    }
    public int getYear() {
        return year;
    }
}
