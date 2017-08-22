import chainofrespons.MinusOperation;
import chainofrespons.OperationExecutor;
import chainofrespons.OperationMultiply;
import chainofrespons.PlusOperation;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by klb on 21.08.17.
 */
public class ChainOfRespTest {

    @Test
    public void test() {
        String []t = {"+ 2", "- 1", "+ 3", "- 1", "* 4"};
        OperationExecutor mult = new OperationMultiply();
        OperationExecutor plus = new PlusOperation();
        OperationExecutor minus = new MinusOperation();
        mult.setNextOperation(plus);
        plus.setNextOperation(minus);
        for(String token : t) {
            mult.compute(token);
        }

        assertEquals(12, OperationExecutor.getResult(), 0);
    }
}
