import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by klb on 01.08.17.
 */
public class MainTest {

    @Test
    public void test1() {
        int t[][] = {{2,1,3}, {10, 5, -1}, {15,6,5}};

        assertEquals(1, Main.extr(t).min);
        assertEquals(10, Main.extr(t).max);

        int t2[][] = {{2,2,2}, {2, 2, 2}, {2,2,2}};

        assertEquals(2, Main.extr(t2).min);
        assertEquals(2, Main.extr(t2).max);

        int t3[][] = {{5,1,2}, {6, 6, 6}, {6,6,6}};
        assertEquals(2, Main.extr(t3).min);
    }
}
