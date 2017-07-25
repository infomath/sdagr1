import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by klb on 25.07.17.
 */
public class BinarySearchTest {

    private static String[] tab;

    @BeforeClass
    public static void setUp() {
        tab =  new String[]{"www", "ggg", "bb", "bb", "ab", "aa"};
    }

    @Test
    public void testRek() {
        assertTrue(BinSearch.searchRek(tab, "ggg", 0, tab.length -1));
        assertFalse(BinSearch.searchRek(tab, "xx", 0, tab.length -1));
    }

    @Test
    public void testIter() {
        assertTrue(BinSearch.searchIter(tab, "ggg"));
        assertFalse(BinSearch.searchIter(tab, "xx"));
    }
}
