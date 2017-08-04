import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by klb on 04.08.17.
 */
public class TextOpsTest {

    @Test
    public void test1() {
        assertEquals(4 , TextOperations.nwp("abcce",
                                            "xabyccw"));

        assertEquals(2 , TextOperations.nwp("wwwaaa",
                "wa"));

        assertEquals(0 , TextOperations.nwp("",
                "wa"));
    }

}
