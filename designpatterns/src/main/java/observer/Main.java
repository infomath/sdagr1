package observer;

/**
 * Created by klb on 22.08.17.
 */
public class Main {

    public static void main(String[] args) {
        Subject sub = new Subject(0);
        new Informer(sub);
        new TaxObserver(sub);
        sub.setValue(100);
    }
}
