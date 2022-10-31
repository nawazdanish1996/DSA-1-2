package com.nawaz;
import java.util.Scanner;

public class QuestionOne {
    public static void main(String args[]){
        // Q: Take input of 2 numbers and print the sum.

        Scanner in = new Scanner(System.in);
        System.out.print("Enter Operators: ");
        // Operators
        char op = in.next().trim().charAt(0);

        if(op == '+'){
            // numbers
            int num1 = in.nextInt();
            int num2 = in.nextInt();
            System.out.println(num1+num2);
        }else if(op == '-'){
            int num1 = in.nextInt();
            int num2 = in.nextInt();
            System.out.println(num1-num2);
        }else if(op == '/'){
            int num1 = in.nextInt();
            int num2 = in.nextInt();
            System.out.println(num1/num2);
        }else if(op == '*'){
            int num1 = in.nextInt();
            int num2 = in.nextInt();
            System.out.println(num1*num2);
        }else if(op == '%'){
            int num1 = in.nextInt();
            int num2 = in.nextInt();
            System.out.println(num1%num2);
        }else{
            System.out.println("Invalid Input");
        }
    }
}
