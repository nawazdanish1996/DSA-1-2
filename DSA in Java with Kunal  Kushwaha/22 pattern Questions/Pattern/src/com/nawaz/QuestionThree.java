package com.nawaz;
/*Q:3
****
***
**
*
 */
public class QuestionThree {
    public static void main(String[] args) {
        pattern3(4);
    }

    static void pattern3(int n){
        for (int i=0; i<n; i++){
            for (int j=0; j<n-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
