package ch.hslu.sw06;

public class Add implements Calculator {

    @Override
    public long add(int a, int b) {
        return (long) a + b;
    }

}
