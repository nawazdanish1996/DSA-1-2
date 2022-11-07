package com.nawaz;
/*Q:5
1
12
123
1234
12345
 */
public class QuestionFive {
    public static void main(String[] args) {
        pattern5(5);
    }

    static void pattern5(int n){
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}
