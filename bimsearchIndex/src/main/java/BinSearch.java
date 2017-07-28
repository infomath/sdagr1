/**
 * Created by klb on 28.07.17.
 */
public class BinSearch {

    // -1 1 3 5 7 9
   //   0 1 2 3 4 5
    public static int fin(int []t) {
        int i = 0;
        int j = t.length -1;
        while(i <= j) {
            int s = (i+j)/2;
            if(t[s] == s) {
                return s;
            }
            if(t[s] > s) {
                //szukamy po lewej stronie
                j = s - 1;
            } else {
                //szukamy po prawej stronie
                i = s + 1;
            }

        }

        return -1;
    }
}
