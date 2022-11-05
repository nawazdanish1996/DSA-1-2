package com.nawaz;
import java.util.HashMap;
import java.util.Map;

public class HashMaps {
    public static void main(String[] args) {
        HashMap<String, Integer> result = new HashMap<>();
//        System.out.println(result);

        // put() function
        result.put("Instagram", 0);
        result.put("Facebook", 0);
        result.put("LinkedIn", 1);
        result.put("Twitter", 1);
        result.put("YouTube", 4);
        result.put("What's App", 1);
        System.out.println(result);

        // remove function
        result.remove("Facebook");
        result.remove("Instagram");
//        System.out.println(result);

        // contains (to check it is true/false)
        boolean contain = result.containsKey("Facebook");
//        System.out.println(contain);

        // entry function
        for (Map.Entry<String, Integer> i: result.entrySet()){
            System.out.println(i.getKey()+" "+i.getValue());
        }
    }
}
