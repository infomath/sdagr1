import bst.BST;
import bst.BSTImpl;
import bst.BSTSet;
import bst.BSTSetImpl;
import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 *      bcde
 *   aaa      ggg
 *     abc   cef
 */

//      aaa  abc     bcde   cef   ggg
public class BSTest {

    @Test
    public void testBST() {
        BST<String> bst = new BSTImpl<>();
        bst.add("bcde");
        bst.add("aaa");
        bst.add("abc");
        bst.add("ggg");
        bst.add("cef");
        bst.add("cef");
        bst.add("cef");
        System.out.println("BST: " + bst.show());



        assertTrue(bst.search("cef"));
        assertTrue(bst.search("aaa"));
        assertTrue(bst.search("ggg"));

        assertFalse(bst.search("xyz"));
    }

    @Test
    public void testBSTSet() {

        BSTSetImpl<String> bst = new BSTSetImpl<>();
        bst.add("bcde");
        bst.add("aaa");
        bst.add("abc");
        bst.add("ggg");
        bst.add("cef");
        bst.add("cef");
        System.out.println("BST set: " + bst.show());
    }

    @Test
    public void testMultSets() {
        BSTSetImpl<String> bst = new BSTSetImpl<>();
        bst.add("bcde");
        bst.add("aaa");
        bst.add("abc");
        bst.add("ggg");
        bst.add("cef");

        BSTSetImpl<String> bst2 = new BSTSetImpl<>();
        bst2.add("xyz");
        bst2.add("aaa");
        bst2.add("abcde");
        bst2.add("hhh");
        bst2.add("cef");

        BSTSetImpl<String> bst3 =(BSTSetImpl) bst.mult(bst2);
        String bst3string = bst3.show();
        System.out.println("Multiplication result: " + bst3string);
    }
}
