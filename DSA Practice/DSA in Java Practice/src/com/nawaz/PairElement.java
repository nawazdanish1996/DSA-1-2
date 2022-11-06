package com.nawaz;
/*
Question: Find all pairs whose elements sum is equal to the target sum.
int[] arr = {1 2 3 4 5 6} int
k = 7;
Output: {1,6} {2,5} {3,4}
 */
public class PairElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int k = 7;
        getPairsCount(arr, k);
    }

    static void getPairsCount(int[] arr, int k) {
        for (int i=0; i < arr.length; i++)
            for(int j=i+1; j<arr.length; j++)
                if((arr[i] + arr[j]) == k)
        System.out.println(arr[i]+","+arr[j]);
    }
}
