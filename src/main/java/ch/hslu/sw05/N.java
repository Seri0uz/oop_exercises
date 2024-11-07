package ch.hslu.sw05;
/**
 * Element Nitrogen
 * @author Samuel Duss
 */
public class N extends Element {
    public N() {
        super(-209.86f,-195.795f);
    }
    public static void main(String[] args) {
        N n = new N();
        n.getAggregateState();
        n.getBoilingPoint();
        n.getMeltingPoint();
    }
}
