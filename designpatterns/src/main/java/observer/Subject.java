package observer;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by klb on 22.08.17.
 */
public class Subject {
    private List<Observer> obsList = new LinkedList<>();

    private int value;

    public Subject(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;

        //po zmianie wartosci, powiadom wszystkich obesrwatorow o tym fakcie
        update();
    }

    //metoda dodaje do listy kolejnego obserwatora
    public void add(Observer obs) {
        obsList.add(obs);
    }

    public void update() {
        for(Observer ob : obsList) {
            ob.update();  //powiadomienie o zmianie - w efekcie wywolanie reakcji danego obserwatora
        }
    }
}
