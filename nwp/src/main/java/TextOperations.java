/**
 * Created by klb on 04.08.17.
 */
public class TextOperations {

    public static int nwp(String a, String b) {
        int n = a.length();
        int m = b.length();

        int D[][] = new int[n+1][m+1];
        //wszystkie komorki maja wartosc 0 domyslnie

        for(int i=1; i <=n; i++) {
            for(int j=1;j<=m; j++) {
                if(a.charAt(i-1) == b.charAt(j-1)) {
                    //aktualizujemy w tablicy D dlugosc
                    //nwp podnapisow a0..ai-1, b0..bj-1
                    D[i][j] = D[i-1][j-1] + 1;
                } else {
                    //dlugosc nwp a0..ai-1, b0..bj
                    int d1 = D[i-1][j];

                    //dlugosc nwp a0..ai, b0..bj-1
                    int d2 = D[i][j-1];
                    if(d1 > d2) {
                        D[i][j] = d1;
                    } else {
                        D[i][j] = d2;
                    }
                }
            }
        }
        return D[n][m];
    }
}
