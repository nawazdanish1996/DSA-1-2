package com.nawaz;

public class IntegerFunction {
    public static void main(String args[]){
//        int ans = sum1(5, 6);
//        System.out.println(ans);

        String my = myGreet();
        System.out.println(my);
    }

    static String myGreet() {
        String a = "Mister";
        return a;
    }

    static int sum1(int a, int b){
        int sum = a+b;
        return sum;
    }
}
