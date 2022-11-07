package com.nawaz;

import java.util.Arrays;

public class Comparison {
    public static void main(String[] args) {
        String name1 = "Nawaz";
        String name2 = "Nawaz";
        System.out.println(name1 == name2); // true

        String a = new String("Nawaz");
        String b = new String("Nawaz");
        System.out.println(a == b); // false
        System.out.println(a.equals(b)); // true

    }
}
