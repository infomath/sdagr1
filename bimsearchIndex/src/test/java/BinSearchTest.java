import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by klb on 28.07.17.
 */
public class BinSearchTest {

    @Test
    public void tes1() {
        int[] t = {-1,1, 3, 4, 5, 10 };
        assertEquals(1, BinSearch.fin(t));
    }

}
