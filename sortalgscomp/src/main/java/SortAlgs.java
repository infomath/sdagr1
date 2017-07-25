/**
 * Created by klb on 25.07.17.
 */
public class SortAlgs {

    //n^2
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

    //n * logn
    public static void quicksort(double []t, int b, int e) {
        int i = b;
        int j = e;
        int s = (i+j)/2;
        double pivot = t[s]; //tablica zostanie podzielona pod wzgledem tego elementu
        //na:        elementy lewe < pivot >= elementy prawe
        do {
            //pomijamy te elementy, ktore sa w "dobrej" relacji
            //z elementem pivot
            while(t[i] < pivot) { i++; }
            while(t[j] > pivot) { j--; }
            if(i <= j) { //sprawdzamy czy nalezy zamienic miejscami elemnty pary (i, j)
                double temp = t[i];
                t[i] = t[j];
                t[j] = temp;
                i++;
                j--;
            }
        } while(i <= j);

        if(b < j) {  //sprawdzamy czy jest sens sortowac lewa czesc
            quicksort(t, b, j);
        }
        if(i < e) { // ----- prawa czesc
            quicksort(t, i, e);
        }
    }
}
