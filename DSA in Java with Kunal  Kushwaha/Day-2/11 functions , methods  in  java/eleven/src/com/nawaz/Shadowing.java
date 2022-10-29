package com.nawaz;

public class Shadowing {
    static int a = 90; // this will be shadowed at line 9.

    public static void main(String[] args) {
        System.out.println(a); //90
        int a; // the class variable at line 4 is shadowed by this.
        a=40;
        System.out.println(a);  // 50
        fun(); //90
    }

    static void fun(){
        System.out.println(a);
    }
}
