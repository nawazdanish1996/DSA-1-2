package com.nawaz;
/*Q:4
*
**
***
****
*****
****
***
**
*
*/
public class QuestionFour {
    public static void main(String[] args) {
        pattern4(5);
    }

    static void pattern4(int n){
        for (int i=1; i<=2*n; i++){
            int totalCol = i>n ? 2*n -i : i;
            for (int j=1; j <= totalCol; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
