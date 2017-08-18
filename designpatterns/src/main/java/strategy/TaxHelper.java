package strategy;

/**
 * Nastepny wzorzec - fasada
 */
public class TaxHelper {
    //ta klasa jest "parametryzowana" strategia:
    private ITax itax = null;
    private final static double SPECIAL_TAX = 0.3;

    //ta metoda oblicza podattek za pomoca pewnego wzoru
    //wykorzystuje strategie i robi dodatkowe obliczenia
    public double compTaxPlusSpecialTax(double val) throws TaxStrategyException {
        if(itax == null) {
            throw new TaxStrategyException();
        }

        return itax.compute(val)  //uzycie strategii
                + SPECIAL_TAX*val;  //dodatkowe
    }

    public void changeTax(Country country) {
        //TODO: dokonczyc
    }
}
