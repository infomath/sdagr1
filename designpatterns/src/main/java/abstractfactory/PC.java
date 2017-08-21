package abstractfactory;

/**
 * Created by klb on 21.08.17.
 */
public class PC extends Component {
    private String brand;

    public PC(double price, String brand) {
        super(price);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
