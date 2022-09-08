/*Conditional Statement; if, else */

//package
import java.util.*;

//class
class ConditionalStatement{
    //function
    public static void main(String args[]) {
        //input le liye yaha
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age > 18){
            System.out.println("You are Young");
        }
        else if(age > 60){
            System.out.println("You are Old Man");
        }
        else{
            System.out.println("You are Child");
        }
    }
}