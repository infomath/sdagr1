package abstractfactory;

/**
 * Created by klb on 21.08.17.
 */
public abstract class Component implements Element {
    protected double price;

    public Component(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
