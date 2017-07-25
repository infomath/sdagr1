/**
 * Created by klb on 24.07.17.
 */
public class SortAlgs {

    public static void bubble(double []t) {

        int n = t.length;
        int k  = n;
        do {
            //od poczatku zaczynamy porownywac pary
            //i dzieki temu "wypychamy" na koniec tablicy kolejne maximum
            for(int i = 0; i <= k-2; i++) {
                if(t[i+1] < t[i]) {
                    double temp = t[i];
                    t[i] = t[i+1];
                    t[i+1] = temp;
                }
            }
            k--;
        } while(k > 0);  //dopoki nie wezmiemy pod uwage wszystkich elementow
    }


}
