package com.nawaz;

import java.util.Arrays;

public class DynamicArray {
    public static void main(String[] args) {
        int[][] arr={
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        for (int row=0; row<arr.length; row++){
            System.out.println(Arrays.toString(arr[row]));
        }
    }
}
