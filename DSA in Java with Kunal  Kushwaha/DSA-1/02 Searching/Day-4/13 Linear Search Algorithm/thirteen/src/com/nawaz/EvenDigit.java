package com.nawaz;

// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class EvenDigit {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(54637));
    }
    static int findNumbers(int[] nums) {
        int count = 0;
        for(int num: nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }

    private boolean even(int num) {
        int numberOfDigits = digit(num);
        if(numberOfDigits %2 == 0){
            return true;
        }
        return false;
    };

    static boolean digit(int num){
        int count = 0;
        while (num > 0){
            count++;
            num = num /10;
        }
    };

}
