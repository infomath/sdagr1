package observer;

/**
 * Created by klb on 22.08.17.
 */
public class TaxObserver extends Observer {
    public TaxObserver(Subject subject) {
        super(subject);
        subject.add(this);
    }

    @Override
    public void update() {
        System.out.println("Nowy podatek: " + subject.getValue() * 0.24);
    }
}
