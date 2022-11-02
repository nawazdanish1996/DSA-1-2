package com.nawaz;
import java.util.Scanner;

public class FuibonacciNumbers {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        // Q: Find the nth Fuibonacci Number.

        int n = in.nextInt();
        int a = 0;
        int b =1;
        int count = 2;

        while(2 <= n){
            int temp = 1;
            b = b+a;
            a = temp;
            count++;
        }
        System.out.println(b);

    }
}
