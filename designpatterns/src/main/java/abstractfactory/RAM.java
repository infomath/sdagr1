package abstractfactory;

/**
 * Created by klb on 21.08.17.
 */
public class RAM extends Component {
    private int size;

    public RAM(double price, int size) {
        super(price);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
