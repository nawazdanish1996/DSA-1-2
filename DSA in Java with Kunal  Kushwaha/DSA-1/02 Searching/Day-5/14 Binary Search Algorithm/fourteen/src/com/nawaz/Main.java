package com.nawaz;


public class Main {

    public static void main(String[] args) {
        /*
            Q: What is Binary Search in java?
            Ans: Binary search is used to search a key element
            from multiple elements. Binary search is faster than
            linear search
         */
        int[] arr = {10, 5, 6, 8, 9, 56, 50, 18, -12, 0};
        int target = 0;
        int ans = search(arr, target);
        System.out.println(ans);
    }

    static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length -1;

        while(start <= end){
            // find middle element
            int mid = start + (end - start) / 2;

            if(target < arr[mid]){
                end = mid-1;
            }else if(target > arr[mid]){
                start = mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    };
}
