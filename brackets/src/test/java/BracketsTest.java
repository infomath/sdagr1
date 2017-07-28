import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by klb on 28.07.17.
 */
public class BracketsTest {

    @Test
    public void test1() {
        Brackets br = new Brackets();
        assertEquals(1, br.solution("[(){}]"));
        assertEquals(1, br.solution("([[]]){}"));
        assertEquals(0, br.solution("[(){}])("));
    }
}
