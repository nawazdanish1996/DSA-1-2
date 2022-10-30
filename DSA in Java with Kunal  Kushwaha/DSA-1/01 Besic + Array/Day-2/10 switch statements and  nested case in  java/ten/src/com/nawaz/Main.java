package com.nawaz;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // Nested switch case

        System.out.println("Enter switches 1,2: ");
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();

        switch (empID){
            case 1:
                System.out.println("Nawaz Danish");
                break;
            case 2:
                System.out.println("employee number 3");
                switch (department){
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Management":
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("No department");
                        break;
                }
                break;
            default:
                System.out.println("Enter correct employee id");
                break;
        }

    }
}
