package com.nawaz;
import java.util.Scanner;

public class Largest {
    public static void main(String args[]){
        // Q: Find the largest number of 3 numbers.
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        int b = inp.nextInt();
        int c = inp.nextInt();

        int max = a;
        if(b > max){
            max = b;
        }
        if(c > max){
            max = c;
        }
        System.out.println(max);

    }
}
