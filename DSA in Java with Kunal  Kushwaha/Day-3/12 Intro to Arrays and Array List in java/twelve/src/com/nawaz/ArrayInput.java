package com.nawaz;
import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int arr[] = new int[5];
        arr[0] = 15;
        arr[1] = 20;
        arr[2] = 55;
        arr[3] = 96;
        arr[4] = 3;
        // [15, 20, 55, 96, 3]
//        System.out.println(arr[3]);

        // input using for loop
        for(int i=0; i < arr.length ; i++){
//            System.out.print(arr[i]+" ");
        }
        for(int num : arr){
            System.out.println(num+" ");
        }
    }
}
