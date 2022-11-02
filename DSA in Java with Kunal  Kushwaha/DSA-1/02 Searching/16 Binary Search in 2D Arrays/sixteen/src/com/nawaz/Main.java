package com.nawaz;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    // Binary search in 2D Array
        int[][] arr= {
                {18, 9, 12},
                {36, -4, 91},
                {44, 33, 16}
        };
        int target = 5;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] matrix, int target) {
        int r = 0;
        int c = matrix.length -1;
        while( r < matrix.length && c >= 0){
            if(matrix[r][c] == target){
                return new int[]{r, c};
            }
            if(matrix[r][c] < target){
                r++;
            }else{
                c--;
            }
        }
        return new int[] {-1, -1};
    };
}
