package com.nawaz;
/*Q:6
    *
   **
  ***
 ****
*****
 */
public class QSix {
    public static void main(String[] args) {
        pattern6(5);
    }
    static void pattern6(int n){
        for (int i=0; i<n; i++){
            for (int j=(n-i); j>=0; j--){
                System.out.print(" ");
            }
            for (int k=0; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Task Completed");
    }
}
