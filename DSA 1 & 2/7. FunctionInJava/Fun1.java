import java.util.*;

class HelloWorld {
    public static int myFun(int a, int b){
        int sum = a + b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int sum = myFun(a, b);
        
        System.out.println(sum);

        sc.close();
    }
}