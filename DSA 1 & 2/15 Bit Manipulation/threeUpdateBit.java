import java.util.*;
public class threeUpdateBit {
    // 0101 to 0111
    // clear + set = update
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        // operation=1 set operation=0 clear
        int n = 5;
        int pos = 1;

        int bitMask = 1<<pos;
        if(oper == 1){
            // set Operator
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        }else{
            int newBitMask = ~(bitMask);
            int newNumber = newBitMask & n;
            System.out.println(newNumber);
        }

        sc.close();
    }
}
