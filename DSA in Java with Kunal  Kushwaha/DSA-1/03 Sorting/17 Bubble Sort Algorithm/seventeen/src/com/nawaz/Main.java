package com.nawaz;
import java.util.Arrays;

// Q: What is Bubble Sort Algorithm?
        /*
        Ans: Bubble sort is the simplest sorting Algorithm that
        works by repeatedly swapping the adjacent if they are in
        the wrong order.
         */
public class Main {
    public static void main(String[] args) {
        // 3, 1, 5, 4, 2 through swapping 1,2,3,4,5
        int[] arr = {5, 4, 55, 2, 1};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr){
        // run the step n-1 times
        for(int i=0; i<arr.length; i++){
            for (int j=1; j< arr.length-i; j++){
                // swap if the item is samaller than the previous item.
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}
