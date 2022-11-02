package com.nawaz;

public class Main {

    public static void main(String[] args) {
	// Multiple if else statement.

        int salary = 25000;

        if(salary > 10000){
            System.out.println(salary += 2000);
        }else if(salary > 2000){
            System.out.println(salary += 3000);
        }else{
            System.out.println("Invalid Input");
        }
    }
}
