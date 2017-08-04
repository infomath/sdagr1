import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by klb on 27.07.17.
 */
public class FibonacciTest {

    //1 1 2 3 5 8
    @Test
    public void test1() {
        Fibonacci fib = Fibonacci.getInstance();
        assertEquals(1, fib.getNumber(2));
        assertEquals(5, fib.getNumber(5));
    }
}
