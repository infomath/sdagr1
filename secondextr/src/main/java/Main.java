/**
 * Created by klb on 01.08.17.
 */



public class Main {

    public static class SecondExtr {
        public int min;
        public int max;
    }

    //5, 1, 2   //t ma n=k*m
    public static SecondExtr extr(int [][]t) {
        SecondExtr secondExtr = new SecondExtr();
        int min1=t[0][0], min2=t[0][0];
        int max1=t[0][0], max2=t[0][0];

        //{5,1,2}
        //min1=1 min2=5
        for(int i =0; i < t.length; i++) {
            for(int j = 0; j < t[i].length; j++) {
                if(t[i][j] < min1) {
                    min2=min1;   //=1
                    min1=t[i][j];  //=1
                } else if(t[i][j] < min2) {
                    min2=t[i][j];
                }
                else if(t[i][j] > max1) {
                    max2 = max1;
                    max1 = t[i][j];
                }  else if(t[i][j] > max2) {
                    max2=t[i][j];
                }
            }
        }
        secondExtr.min = min2;
        secondExtr.max = max2;
        return secondExtr;

    }

}
