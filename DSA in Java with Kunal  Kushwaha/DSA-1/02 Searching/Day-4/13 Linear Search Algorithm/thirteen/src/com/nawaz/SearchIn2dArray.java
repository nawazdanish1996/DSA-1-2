package com.nawaz;
import java.util.Arrays;

public class SearchIn2dArray {
    public static void main(String[] args) {
        // search in 2D Array
        int[][] arr= {
                {23, 4, 1},
                {5, 9, 6},
                {2, 34, 9},
                {18, 12}
        };
        int target = 9;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] arr, int target){
        for (int row=0; row < arr.length; row++){
            for (int col=0; col < arr[row].length; col++){
                if(arr[row][col] == target){
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    };
}
