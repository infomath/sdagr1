package strategy;

/**
 * Created by klb on 18.08.17.
 */
public class TaxEng implements  ITax {

    private final static double tax = 0.24;

    public double compute(double val) {
        return val * tax + 0.1;
    }
}