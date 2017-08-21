package facade;

/**
 * Created by klb on 21.08.17.
 */
public class Main {

    public static void main(String[] args) {
        BankSystem bank = new BankSystem();
        User user1 = new User("kasia", "dccfefe");
        User user2 = new User("basia", "dccfefe");
        double cash = 2000;
        bank.getCash(cash, user1);
        bank.sendCash(cash, user2);

    }
}
