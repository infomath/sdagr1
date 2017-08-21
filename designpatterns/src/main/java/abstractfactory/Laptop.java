package abstractfactory;

/**
 * Created by klb on 21.08.17.
 */
public class Laptop extends Component {

    private int battery;

    public Laptop(double price, int battery) {
        super(price);
        this.battery = battery;
    }

}
