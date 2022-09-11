// input fName and lName from Users
import java.util.*;

public class oneString {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String fName = sc.next();
        String lName = sc.next();

        /*
         *  Definition and Usage
            The concat() method appends (concatenate)
            a string to the end of another string.
         */
        //concat()  concatication
        String fullName = fName.concat(" " +lName);

        // System.out.println(fullName);
        // System.out.println(fullName.length());

        /*
         *  Definition and Usage chatAt():
            The charAt() method returns the character
            at the specified index in a string.
         */
        // charAt()
        // char mi = fullName.charAt(2);
        // System.out.println(mi);

        for(int i=0; i<fullName.length(); i++){
            System.out.println(fullName.charAt(i));
        }

        sc.close();
    }
}
