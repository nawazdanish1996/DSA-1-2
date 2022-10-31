package com.nawaz;

public class CountingOccurrences {
    public static void main(String args[]){
        int n = 5;
        int count = 0;
        while(n > count){
            int rem = n % 10;
            if(rem == 5){
                count++;
            }
            n= n/10;
        }
        System.out.println(count);
    }
}
