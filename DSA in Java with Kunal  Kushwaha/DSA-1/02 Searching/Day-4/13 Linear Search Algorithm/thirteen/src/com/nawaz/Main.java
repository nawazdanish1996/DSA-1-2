package com.nawaz;

public class Main {

    public static void main(String[] args) {
        // Q: Find 14 exist is in array or not
        int arr[] = {10, 15, 19 , 30, 40, 14, -11};
        int target = 30;
        int ans = search(arr, target);
        System.out.println(ans);
    }

    //search in the array: array return the index if item found.
    // otherwise, if item not found return -1.
    static int search(int arr[], int target){
        if(arr.length == 0){
            return -1;
        }

        // run a for loop
        for(int i=0; i < arr.length; i++){
            // check for element at every index of it is = target.
            int element = arr[i];
            if(element == target){
                return i;
            }
        }
        // this line will execute if none of the return statement above executed.
        return -1;
    }
}
