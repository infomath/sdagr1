package templatemethod;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by klb on 22.08.17.
 */
public abstract class  Filter {

    protected List<Car> cars = new LinkedList<>();

    public abstract void changeElements();
    public abstract void removeElements();

    public void filterRemoveChange() {
        //TODO:
        changeElements();
        removeElements();
    }
}
