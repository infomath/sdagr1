import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertTrue;

/**
 * Created by klb on 25.07.17.
 */
public class SortAlgsTest {

    private double T[];

    public static double [] randomArray(int n, int a, int b) {
        Random rand = new Random();
        double []result = new double[n];
        for(int i = 0; i < n; i++) {
            result[i] = a + rand.nextInt(b - a + 1);
        }
        return result;
    }

    private void print(double []T) {
        for(double el : T) {
            System.out.print(el + " ");
        }
        System.out.println();
    }

    @Before
    public  void setUp() {
        T = randomArray(10, 100, 200);
    }

    private boolean checkOrder(double []t) {
        if(t.length == 1) {
            return true;
        }
        for(int i = 0; i <= t.length -2; i++) {
            if(t[i] > t[i+1]) {
                return false;
            }
        }

        return true;
    }

    @Test
    public void quickSortTestCorrectResult() {
        print(T);
        SortAlgs.quicksort(T, 0, T.length - 1);
        assertTrue(checkOrder(T));
        print(T);
    }
}
