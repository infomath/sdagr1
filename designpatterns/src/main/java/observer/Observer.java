package observer;

/**
 * Created by klb on 22.08.17.
 */
public abstract class Observer {
    //referencja na obiekt ktorego wartosc bedzie sie zmieniala
    protected Subject subject;

    public Observer(Subject subject) {
        this.subject = subject;
    }

    public abstract void update();
}
