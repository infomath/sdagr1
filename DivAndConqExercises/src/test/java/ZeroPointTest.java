import com.klb.FunctionHelper;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by klb on 24.07.17.
 */
public class ZeroPointTest {

    private static FunctionHelper helper = null;

    @BeforeClass  //ta metoda wykona sie raz przed wszystkimi metodami
    //testowymi
    public static void setUp() {
        helper = new FunctionHelper();
    }

    @Test
    public void testZetoPointExists() {
        double fun[] = {-3, -2, -2, 0, 1, 2, 2, 3, 4, 6};
        assertEquals(3, helper.zeroPoint(fun, 0, fun.length-1));
        double fun2[] = {-3, -2, -2, -2, -1, -1, -1, 0, 4, 6};
        assertEquals(7, helper.zeroPoint(fun2, 0, fun2.length-1));

        double fun3[] = {-3, -2, -2, -2, -1, -1, -1, 4, 4, 6};
        assertEquals(-1, helper.zeroPoint(fun3, 0, fun3.length-1));
    }

}
