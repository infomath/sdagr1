import bst.BST;
import bst.BSTImpl;
import org.junit.Test;

/**
 *      bcde
 *   aaa      ggg
 *     abc   cef
 */

//      aaa  abc     bcde   cef   ggg
public class BSTest {

    @Test
    public void test1() {
        BST<String> bst = new BSTImpl<>();
        bst.add("bcde");
        bst.add("aaa");
        bst.add("abc");
        bst.add("ggg");
        bst.add("cef");
        System.out.println(bst.show());
    }
}
