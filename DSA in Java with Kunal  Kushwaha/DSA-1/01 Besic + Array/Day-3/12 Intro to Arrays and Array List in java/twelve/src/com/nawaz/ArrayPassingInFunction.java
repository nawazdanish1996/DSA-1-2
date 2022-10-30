package com.nawaz;
import java.util.Arrays;

public class ArrayPassingInFunction {
    public static void main(String[] args) {
        // Array passing in  a function.
        int[] nums = {5, 2, 3, 66, 9};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void change(int[] arr){
        arr[0] = 99;
    }
}
