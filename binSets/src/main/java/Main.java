import java.util.Scanner;

/**
 * Created by klb on 31.07.17.
 */
public class Main {

    private static void loadNumbers( boolean []T) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            int num = scanner.nextInt();
            if(num == -1) {
                break;
            }
            if(num < 1 || num > 1000) {
                System.out.println("Podales liczbe spoza dozwolonego zakresu");
                continue;
            }

            T[num-1] = true;
        }
    }


    //A = [0,1,...]
    public static void main(String[] args) {
        boolean []A = new boolean[BinSet.MAX_SIZE]; //indeks 0 oznacza 1, 1 oznacza 2

        boolean []B = new boolean[BinSet.MAX_SIZE];

        System.out.println("Podaj elementy zbioru A od 1 do 1000, wpisz -1 aby zakonczyc:");
        loadNumbers(A);

        System.out.println("Podaj elementy zbioru B od 1 do 1000, wpisz -1 aby zakonczyc:");
        loadNumbers(B);
        boolean []C = BinSet.mult(A, B);
        System.out.print("Wynik={");
        for(int i = 0; i < BinSet.MAX_SIZE; i++) {
            if(C[i]) {
                System.out.print(i+1 + ", ");
            }
        }
        System.out.print("}\n");
    }
}
