package ch.hslu.sw05;
/**
 * Element Lead
 * @author Samuel Duss
*/
public class Pb extends Element{
   public Pb() {
       super(327f,1749f);
    }
    public static void main(String[] args) {
        Pb pb = new Pb();
        pb.getAggregateState();
    }
}
