package enums;

/**
 * Created by klb on 21.08.17.
 */
public enum Cities {

    KRAKOW(100, 200),
    WROCLAW(50, 150);

    private int x;
    private int y;

    Cities(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distanceFromZero() {
        return Math.sqrt(x*x + y*y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
