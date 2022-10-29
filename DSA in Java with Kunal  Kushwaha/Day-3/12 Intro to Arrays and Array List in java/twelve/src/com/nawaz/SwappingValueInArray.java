package com.nawaz;
import java.util.Arrays;

public class SwappingValueInArray {

    public static void main(String args[]) {
        int[] arr = {1, 3, 9, 5, 6};
        mySwap(arr, 3, 5);

        System.out.println(Arrays.toString(arr));
    }

    static void mySwap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    };
}
