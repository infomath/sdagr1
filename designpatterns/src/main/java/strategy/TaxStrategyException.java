package strategy;

/**
 * Created by klb on 18.08.17.
 */
public class TaxStrategyException extends Throwable {

    public TaxStrategyException() {
        super("Nie ustalono strategii obliczania podatku");
    }
}
