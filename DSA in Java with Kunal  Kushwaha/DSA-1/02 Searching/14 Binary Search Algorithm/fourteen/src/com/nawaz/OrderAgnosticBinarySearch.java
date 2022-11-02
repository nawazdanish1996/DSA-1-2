package com.nawaz;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int arr[] = {5, 90, 75, 18, 12, 6, 4, 3, 1};
        int target = 6;
        int ans = search(arr, target);
        System.out.println(ans);
    }

    static int search(int[]arr, int target){
        int start = 0;
        int end = arr.length -1;

        // find whether the array is sorted in ascending or descending.
        boolean isAsc;
        if(arr[start] < arr[end]){
            isAsc = true;
        }else isAsc = false;

        while(start <= end){
            int mid = start + (end - start) /2;

            if(arr[mid] == target){
                return mid;
            }

            if(isAsc){
                if(target < arr[mid]){
                    end = mid -1;
                }else{
                    start = mid +1;
                }
            }else{
                if(target > arr[mid]){
                    end = mid -1;
                }else{
                    start = mid +1;
                }
            }
        }
        return -1;
    }
}
