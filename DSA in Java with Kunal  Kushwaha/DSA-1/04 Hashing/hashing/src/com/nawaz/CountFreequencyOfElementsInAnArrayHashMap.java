package com.nawaz;
import java.util.HashMap;
import java.util.Map;

/*
Count Frequency of elements in an Array || Hashing Technique ||
HashMap solution.
 */
public class CountFreequencyOfElementsInAnArrayHashMap {
    public static void main(String[] args) {
        int[] arr= new int[]{15,16,27,27,28,15};
        int n = arr.length;
        countFrequency(arr, n);
    }

    static void countFrequency(int[] arr, int n) {
        HashMap<Integer, Integer> result = new HashMap<>();

        for (int i=0; i<n; i++){
            if(result.containsKey(arr[i])){
                result.put(arr[i], result.get(arr[i])+1);
            }else{
                result.put(arr[i], 1);
            }
        }
        for(Map.Entry<Integer, Integer> i: result.entrySet()){
            System.out.println(i.getKey()+" "+ i.getValue());
        }
    }
}
