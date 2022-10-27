import java.util.*;

public class first{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int salary = sc.nextInt();

        if(salary >= 10000){
            System.out.println("Salary: "+ salary);
            System.out.println("Increment: "+ salary/100*10);
            System.out.println("Total: "+salary/100*110);
        }
        else{
            System.out.println("Invalid Input");
        }

        sc.close();
    }
}