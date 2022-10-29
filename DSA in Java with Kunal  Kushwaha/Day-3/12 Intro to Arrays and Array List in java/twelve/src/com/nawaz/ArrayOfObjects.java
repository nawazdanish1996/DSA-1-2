package com.nawaz;
import java.util.Scanner;
import java.util.Arrays;

public class ArrayOfObjects {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // array of Object
        String str[] = new String[2];
        for (int i=0; i<str.length; i++){
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));

        // modify
        str[0] = "Nawaz";
        System.out.println(Arrays.toString(str));
    }
}
