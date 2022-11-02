package com.nawaz;
import java.util.Arrays;
import java.util.Scanner;

public class ToStringMethod {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[] = new int[2];
        arr[0] = 22;
        arr[1] = 2;

//        for(int i=0; i<arr.length; i++){
//            arr[i] = in.nextInt();
//        }
        System.out.println(Arrays.toString(arr));
    }
}
