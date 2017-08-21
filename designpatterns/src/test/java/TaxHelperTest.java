import org.junit.Test;
import strategy.Country;
import strategy.TaxHelper;
import strategy.TaxStrategyException;

/**
 * Created by klb on 21.08.17.
 */
public class TaxHelperTest {

    @Test
    public void test1() {
        TaxHelper th = new TaxHelper();
        th.changeTax(Country.PL);
        th.changeTax(Country.ENG);
        try {
            System.out.println(th.compTaxPlusSpecialTax(100));
        }  catch (TaxStrategyException e) {
            e.printStackTrace();
        }
    }
}
