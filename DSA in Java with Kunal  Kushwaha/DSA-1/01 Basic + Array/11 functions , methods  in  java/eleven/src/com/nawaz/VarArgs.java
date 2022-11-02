// variable arguments.
package com.nawaz;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2,5,9,6);
        mixArguments(5,66,"word","Mis","8","Rana");
    }

    static void mixArguments(int a, int b, String ...v){
        System.out.println(Arrays.toString(v));
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
