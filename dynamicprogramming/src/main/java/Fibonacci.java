import java.util.List;



/**
 * Created by klb on 26.07.17.
 */
// 1. najdluzszy wspolny podciag   2. problem pakowania plecaka

//abbbab    bbaba
public class Fibonacci {
    private final static int MAX = 40;
    private static int t[]; //tablica ktora ma byc wypelniona
    //kolejnymi liczbami Fib. uzywajac progr. dynamicznego

    private static Fibonacci instance = null;

    private Fibonacci() {
        t = new int[MAX];
        t[0] = t[1] = 1;
        t[MAX-1] = fib(MAX-1);
        //pozostale elemety maja domyslna wartosc 0
        //????
    }

    public static Fibonacci getInstance() {
        if(instance == null) {
            instance = new Fibonacci();
        }

        return instance;
    }

    private static int fib(int n) {
        if(n < 2) {
            return 1;
        }
        if(t[n-1] == 0) {
            t[n-1] = fib(n-1);
        }

        if(t[n-2] == 0) {
            t[n-2] = fib(n-2);
        }

        t[n] = t[n-2] + t[n-1];

        return t[n];
    }

    //metoda zwraca n-ta liczbe Fibonacciego
    public int getNumber(int n) {

        return t[n-1];
    }
}
