package com.klb;

/**
 * Created by klb on 24.07.17.
 */
public class FunctionHelper {

    public  int zeroPoint( double []t, int i, int j) {
        if(i == j) {
            if(t[i] == 0) {
                return i;
            }
            return -1;
        }

        int s = (i + j) / 2;
        if(t[s] == 0) {
            return s;
        }
        if(t[s] > 0)
            return zeroPoint(t, i, s-1);  //sukamy miejsca zerowego po lewej stronie s
        return zeroPoint(t, s+1, j); // --||-- prawej

    }

}
