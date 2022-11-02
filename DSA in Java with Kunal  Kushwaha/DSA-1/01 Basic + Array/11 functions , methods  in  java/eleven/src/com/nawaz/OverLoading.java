package com.nawaz;

public class OverLoading {
    public static void main(String[] args) {
        fun(55);
        fun("Mister");
    }

    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println(name);
    }
}
