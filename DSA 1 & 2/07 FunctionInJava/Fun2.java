import java.util.*;

public class Fun2 {

    public static int myFun(int a, int b){
        return a * b;
        // + - / *
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = myFun(a, b);
        System.out.println(sum);


        sc.close();
    }
}
