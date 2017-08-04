import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by klb on 26.07.17.
 */
public class PascalTriangleTest {

    @Test
    public void test1() {
        // (3 2) = 3!/1!*2! = 3

        //tutaj po raz pierwszy i ostatni jest robiony obiekt
        PascalTriangle pt =  PascalTriangle.getInstance();
       // PascalTriangle pt2 = new PascalTriangle();
        assertEquals(3, pt.getVal(3, 2));
        assertEquals(6, pt.getVal(4, 2));
        assertEquals(1, pt.getVal(5, 0));

        //teraz metoda getInstance zwraca juz tylko referencje na
        //wczesniej zrobiony obiekt
        PascalTriangle pt2 =  PascalTriangle.getInstance();
    }

}
