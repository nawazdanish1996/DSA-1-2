package com.nawaz;

public class Reverse {

    public static void main(String args[]){
        // Reverse: 23597 to 79532
        int n = 23597;
        int rev = 0;
        while(n > 0){
            int remainder = n % 10;
            rev = rev * 10 + remainder;
            n = n/10;
        }

        System.out.println(rev);

        /*
        23597
        7*10+9=79
        79*10+5=795
        795*10+3=7953
        7953*10+2=79532
         */
    }
}
