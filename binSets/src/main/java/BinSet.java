/**
 * Created by klb on 31.07.17.
 */
public class BinSet {
    public static final int MAX_SIZE = 1000;
//    A={2,4,5}     = [0,0,1,0,1,1,0..0]
//
//    B = {6, 5, 3} = [0,0,0,1,0,1,1,0...0]
//    C = {5}       = {0,0,0,0,0,1,0....0]

    public static boolean[] mult(boolean []A, boolean []B) {
        if(A.length != MAX_SIZE || B.length != MAX_SIZE) {
            return null;  //rozwiazanie niezalecane
        }

        //wykorzystac iloczyn logiczny do obliczania zbioru wynikowego
        boolean[] C = new boolean[MAX_SIZE];
        for(int i =0; i < C.length; i++) {
            C[i] = A[i] && B[i];
        }

        return C;
    }
}
