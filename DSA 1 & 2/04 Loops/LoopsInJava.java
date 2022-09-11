//package
import java.util.*;
class LoopsInJava {
    public static void main(String args[]){
        //input
        //System.in is a standard input stream
        Scanner sc = new Scanner(System.in);
        // for Loop

        // Print Hello World five time
        // for(int i = 0; i < 5 ; i++){
            // System.out.println("Hello World");
        // }

        // print 1-10
        // i++ means i + 1
        for(int counter = 0; counter < 11; counter++){
            // System.out.println(counter);
            // System.out.print(counter+ " ");
        }


        for(int i = 0; i < 11; i++){
            System.out.print(i+ " ");
        }

        sc.close(); // 'sc' is never closed problem solved 
    }
    
}
