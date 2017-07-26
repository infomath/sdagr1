/**
 * Created by klb on 26.07.17.
 */
public class PascalTriangle {

    /* Zoptymalizuj rozwiazanie tak zeby trojkat byl obliczany raz (o wymiarze np. 20x20),
      a w momencie wywolywanie metody newtonFun byla uzyskiwana odpowiednia wartosc
      z tego trojkata
     */
    private  static int [][]t;

    //referencja na maksymalnie jedna instancje tej klasy
    private static PascalTriangle triangle = null;

    private PascalTriangle() {
        generateTriangle(20);
    }

    public static PascalTriangle getInstance() {
        if(triangle == null) {
            triangle = new PascalTriangle();
        }

        return triangle;
    }

    public int getVal(int n, int k) {
        return t[n][k];
    }

    private static void generateTriangle(int n) {
         t = new int[n+1][];
        //inicjalizacja tablicy trojkatnej
        for(int i = 0; i <=n; i++) {
            t[i] = new int[i+1];
            t[i][0] = t[i][i]  = 1; //na poczatku i na koncu
            //kazdego wiersza jest 1
        }

        //zaczynamy od 3ciego wiersza obliczac wartosci w trojkacie Pascala
        for(int i = 2; i <=n; i++) {
            //obliczamy wartosci itego wiersza
            for(int j = 1; j <= t[i].length - 2; j++) {
                //zwiazek ze wzorem rekurencyjnym: i dotyczy n, j dotyczy k
                t[i][j] = t[i-1][j-1] + t[i-1][j];
            }
        }
    }
}
