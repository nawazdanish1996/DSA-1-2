package com.nawaz;

import java.util.HashMap;
import java.util.Map;

/*
Question: Find the maximum repeated element from the array,
if multiple element have the same high-frequency return a big number.
Input: {1 6 4 2 7 4 2 3 9 2 8 4}
Max repeated No: 2,4 = 3
 */
public class Main {

    public static void main(String[] args) {
        int[] arr = new int[]{1,6,4,2,7,4,2,3,9,2,8,4};
        int n = arr.length;
        find(arr, n);
    }

    static void find(int[] arr, int n) {
        HashMap<Integer, Integer> result  = new HashMap<>();
        for(int i=0; i<n; i++){
            if(result.containsKey(arr[i])){
                result.put(arr[i], result.get(arr[i])+1);
            }else{
                result.put(arr[i], 1);
            }

        }

        for (Map.Entry<Integer, Integer> i: result.entrySet()){
            System.out.println(i.getKey()+ " "+ i.getValue());
        }
    }
}
