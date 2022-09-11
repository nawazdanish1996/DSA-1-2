import java.util.*;

public class FindFactorialNo {

    public static void myFun(int n){
        if(n<0){
            System.out.println("Invalid Number");
            return;
        }
        // loop
        int factorial = 1;
        for(int i=n; i>=1; i--){
            factorial = factorial * i;
        }
        System.out.println(factorial);
        return;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        myFun(n);
        sc.close();
    }

    
}
