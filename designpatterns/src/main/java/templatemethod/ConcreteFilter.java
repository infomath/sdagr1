package templatemethod;

import java.util.Iterator;

/**
 * Created by klb on 22.08.17.
 */
public class ConcreteFilter extends Filter {
    @Override
    public void changeElements() {

    }

    @Override
    public void removeElements() {
        Iterator<Car> lcars = cars.iterator();

        while(lcars.hasNext()) {
            Car car = lcars.next();
            if(car.getBrand().equals("Trabant")) {
                lcars.remove();
            }
        }
    }
}
