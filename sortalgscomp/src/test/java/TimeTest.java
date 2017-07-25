import org.junit.Test;

/**
 * Created by klb on 25.07.17.
 */
public class TimeTest {

    @Test
    public void buubleSortTest() {
        double []t = SortAlgsTest.randomArray(10000, 100, 200);
        long beginTime = System.currentTimeMillis();
        SortAlgs.bubble(t);
        long endTime = System.currentTimeMillis();
        System.out.println("bs: " + (endTime - beginTime));
    }

    @Test
    public void quickSortTest() {
        double []t = SortAlgsTest.randomArray(10000, 100, 200);
        long beginTime = System.currentTimeMillis();
        SortAlgs.quicksort(t, 0, t.length - 1);
        long endTime = System.currentTimeMillis();
        System.out.println("qs: " + (endTime - beginTime));
    }
}
