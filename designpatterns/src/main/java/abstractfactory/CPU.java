package abstractfactory;

/**
 * Created by klb on 21.08.17.
 */
public class CPU extends Component {

    private int frequency;

    public CPU(double price, int frequency) {
        super(price);
        this.frequency = frequency;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }
}
