import org.junit.Test;

/**
 * Created by klb on 27.07.17.
 */
public class SimpleStackTest {

    @Test
    public void test1() {
        SimpleStackImpl<Long> st = new SimpleStackImpl<Long>();
        st.push(1L);
        st.push(2L);
        st.push(3L);
        st.push(4L);

        System.out.println(st);
    }
}
