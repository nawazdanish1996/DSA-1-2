package com.nawaz;

public class Scope {
    public static void main(String[] args) {
        int a =10;
        int b =20;

        // block scope
        {
            // int a=78; already initialised outside the block in the same method
            a =78;
            int c = 99;
            // values initialised in this block, will remain in block.
        }
        //System.out.println(c); // can not use outside the block
    }

    static void random(int marks){
        int num = 64;
        System.out.println(num);
        System.out.println(marks);
    }
}
