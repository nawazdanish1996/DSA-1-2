package com.nawaz;

import java.util.Arrays;
import java.util.Scanner;

public class Two_D_Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Syntax of 2D  Array

//        int[][] arr = new int[3][3];
        int[][] arr={
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        for (int i=0; i<arr.length; i++){
            System.out.println(Arrays.toString(arr[i]));
        }

        // 2D array input
//        int[][] arr= new int[5][5];
//        for(int i=0; i < arr.length; i++){
//            for(int col=0; col < arr[i].length; col++){
//                arr[i][col] = in.nextInt();
//            }
//        };
//        System.out.println(Arrays.toString(arr));

        // 2D Array output
//        for(int i=0; i < arr.length; i++){
//            for(int col=0; col < arr[i].length; col++){
//                System.out.print(arr[i][col] + " ");
//            }
//            System.out.println();
//        };
    }
}
