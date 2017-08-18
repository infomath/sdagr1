package strategy;

/**
 * Created by klb on 18.08.17.
 */
public class TaxPl implements  ITax {

    private final static double tax = 0.18;

    public double compute(double val) {
        return val * tax;
    }
}
