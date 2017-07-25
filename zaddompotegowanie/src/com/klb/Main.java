package com.klb;

public class Main {



    private static double pow(double x, int n) {

        String s = Integer.toBinaryString(n);
        double w = 1;
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '0') {
                w = w * w;
            } else {
                w = w * w * x;
            }
        }
        return w;
    }

    public static void main(String[] args) {
        System.out.println(pow(3, 4));
    }
}
