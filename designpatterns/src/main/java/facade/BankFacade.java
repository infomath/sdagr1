package facade;

import java.util.List;

/**
 * Created by klb on 21.08.17.
 */
public class BankFacade {

    private BankSystem bank = new BankSystem();
    private List<User> users;

    //najczesciej w klasie fasady jest wiele obiektow roznych klas, ktorych uzywanie upraszcza
    //ten wzorzec

    public void transfer(double val, String loginFrom, String loginTo) {

        //szukamy obiektow uzystkownikow na podstawie ich loginow
        User user1 = null;
        User user2 = null;

        bank.getCash(val, user1);
        bank.sendCash(val, user2);
    }
}
