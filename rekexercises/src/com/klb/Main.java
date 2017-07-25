package com.klb;

public class Main {

    private static double mult(double []array, int i) {
        if(i == array.length - 1) {
            return array[i];
        }

        return array[i] * mult(array, i+1);   // wymnozenie i-ego elementu przez wwynik ktory
        //zwroci wywolanie rekurencyjne na pozostalej czesci tablicy
    }

    static void binRekHelp(int n, StringBuilder sb) {

        if(n == 0) {
            return;
        }

        sb.append(n%2);  //dodajemy kolejny bit liczby n
        binRekHelp(n/2,  sb);  //do kolejnego wywolania rekurencyjnego (tak jakby do kolejnej iteracji)
        //przekazujemy o polowe mniejsze n oraz wiekszy o jeden bit ciag  bitow sb
    }



    static void binRek(int n, StringBuilder sb) {
        if(n == 0) {
            sb.append("0");
            return;
        }

        binRekHelp(n, sb);
    }

    public static void main(String[] args) {
        System.out.println(mult(new double[]{1,0.5,2,3}, 0));
    }
}
