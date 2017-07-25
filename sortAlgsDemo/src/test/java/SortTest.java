import org.junit.Test;

/**
 * Created by klb on 24.07.17.
 */
public class SortTest {

    @Test
    public void bubbleSortTest() {
        double tab[] = {5,3,5,2,10,9, 1};
        SortAlgs.bubble(tab);
        for(double el : tab) {
            System.out.print(el + " ");
        }
    }
}
