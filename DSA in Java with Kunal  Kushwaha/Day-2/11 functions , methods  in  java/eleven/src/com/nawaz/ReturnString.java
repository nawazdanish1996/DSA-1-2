package com.nawaz;

public class ReturnString {

    public static void main(String args[]){
        String ans = greet();
        System.out.println(ans);
    }

    static String greet(){
        String greetings = "Hello";
        return greetings;
    }
}
