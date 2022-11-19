package com.linkedlist;

import java.util.LinkedList;

public class ImplementLL {

    public static void main(String[] args) {
        LinkedList<Integer> result = new LinkedList<>();

        result.add(1);
        result.add(2);
        result.add(3);
        result.add(4);
        System.out.println(result);

        // Iterating through LinkedList
        // using forEach loop
        for (int re : result){
            System.out.print(re+", ");
        }
    }
}
