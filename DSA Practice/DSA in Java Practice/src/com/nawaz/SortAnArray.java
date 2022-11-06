package com.nawaz;
import java.util.Arrays;
import java.util.Collections;

/*
Question: Sort the array in a way all odd numbers came first
in ascending order and all even numbers came in descending order.
Input: {1 6 2 7 3 9 8 4}
Output: {1 3 7 9 8 6 4 2}
 */
public class SortAnArray {
    public static void main(String[] args) {
        Integer arr[] = {1,6,2,7,3,9,8,4};
        twoWaySort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void twoWaySort(Integer[] arr, int n) {
        // current indexes from left and right
        int l=0, r=n-1;
        int k = 0;

        while(l < r){
            while(arr[l] % 2 != 0){
                l++;
                k++;
            }

            while(arr[r] % 2 == 0 && l < r)
                r--;

            if(l < r){
                // swap
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
            }

            Arrays.sort(arr, 0, k, Collections.reverseOrder());
            Arrays.sort(arr, k, n);
        }
    }
}
