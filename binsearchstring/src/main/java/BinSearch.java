/**
 * Created by klb on 25.07.17.
 */
public class BinSearch {

    public static boolean searchRek(String []t, String s, int i, int j) {
        if(i > j) {
            return false;
        }

        int d = (i+j)/2;
        if(s.compareTo(t[d]) == 0) {
            return true;
        }
        if(s.compareTo(t[d]) > 0)
        {
            return searchRek(t, s, i, d-1);
        }

        return searchRek(t, s, d+1, j);
    }

    public static boolean searchIter(String []t, String s) {
        int i = 0;
        int j = t.length - 1;

        while(i <= j) {
            int d = (i+j)/2;
            if(s.compareTo(t[d]) == 0) {
                return true;
            }
            if(s.compareTo(t[d]) > 0)
            {
                j= d-1;
                continue;
            }

            i = d + 1;
        }

        return false;




    }
}
