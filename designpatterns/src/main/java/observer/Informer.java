package observer;

/**
 * Created by klb on 22.08.17.
 */
public class Informer extends Observer {
    public Informer(Subject subject) {
        super(subject);

        //do zmienianego obiektu dodac reference na TEGO obserwatora
        subject.add(this);
    }

    @Override
    public void update() {
        System.out.println("Email: stan obiektu zmienil sie");
    }
}
