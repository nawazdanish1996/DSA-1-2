//Package
import java.util.*;

public class SwitchStatement {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        // int b = sc.nextInt();

        // if(a == b){
        //     System.out.println("equal");
        // }
        // else if(a>b){
        //         System.out.println("a is greater");
        // }else{
        //     System.out.println("a is lesser");
        // }


        /*Quiz
         * if 3 is an even number, print "Baringa"
         */
        // if(a % 2 == 0){
        //     System.out.println("Bazinga");
        // }else{
        //     System.out.println("null");
        // }
        
        /* Quiz2
         * Print the greeting
         * Hello Namaste Bonjour
         */
        if(a == 1){
            System.out.println("Hello");
        }else if(a == 2){
            System.out.println("Namaste");
        }else{
            System.out.println("Bonjour");
        }

        // switch(age){
        //     case (age > 18):
        //         System.out.println("Young");
        //     break;
        //     case (age < 18):
        //         System.out.println("Child");
        //     break;
        //     default:
        // }

    }
    
}
