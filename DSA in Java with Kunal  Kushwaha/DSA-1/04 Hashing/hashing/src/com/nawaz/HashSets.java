package com.nawaz;
import java.util.HashSet;
import java.util.Set;

/* 4. Count Distinct elements in an array.
Topic: How to put, delete, and loop through HashMap().
 */
public class HashSets {
    public static void main(String[] args) {
        int arr[] = new int[]{15,27,27,28,15};
        int n = arr.length;
        System.out.println(eventDistinct(arr, n));
    }

    static int eventDistinct(int[] arr, int n) {
        HashSet<Integer> result = new HashSet<>();
        for(int i=0; i<n; i++){
            result.add(arr[i]);
        }
        return result.size();
    }
}
