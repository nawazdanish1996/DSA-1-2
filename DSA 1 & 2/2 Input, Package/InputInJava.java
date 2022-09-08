// package com.nawazdanish;

import java.util.*;

public class InputInJava {
    public static void main(String args[]) {

        // Input
        Scanner sc = new Scanner(System.in);
        // String name = sc.next(); next will print single word
        // nextLine will print full name
        // String name = sc.nextLine(); 
        // System.out.println(name);

        /* Quiz
        Take 2 variables "a" & "b" and print their sum
         */
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println(sum);
        
    }
}
