import chainofrespons.MinusOperation;
import chainofrespons.OperationExecutor;
import chainofrespons.PlusOperation;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by klb on 21.08.17.
 */
public class ChainOfRespTest {

    @Test
    public void test() {
        String []t = {"+ 2", "- 1", "+ 3", "- 1"};
        OperationExecutor plus = new PlusOperation();
        OperationExecutor minus = new MinusOperation();
        plus.setNextOperation(minus);
        for(String token : t) {
            plus.compute(token);
        }

        assertEquals(3, OperationExecutor.getResult(), 0);
    }
}
