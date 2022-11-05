package com.nawaz;

import java.util.HashSet;

// Hashing
/* HashSets: allows you to store unique item and access
them in constant time. No duplicate value stored.*/
public class Main {

    public static void main(String[] args) {
        HashSet<String> result = new HashSet<>();
//        System.out.println(result);

        // add
        result.add("Nawaz Danish");
        result.add("Raja");
        result.add("Rana");
        System.out.println(result);

        // remove (String should be same to remove).
//        result.remove("Nawaz Danish");
//        System.out.println(result);

        // does exist or not
        // other variable will through error
//        boolean contains = result.contains("Raja");
//        System.out.println(contains);

        for(String ele: result){
            System.out.println(ele);
        }
    }
}
