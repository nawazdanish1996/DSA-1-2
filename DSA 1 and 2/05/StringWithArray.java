public class StringWithArray{

    public static void main(String args[]){
        //for loop
        /*for(initialization; condition; increment/decrement){
         *      // statement
         * }*/

         /*Print this Pattern
          1
          1 2
          1 2 3
          1 2 3 4
          1 2 3 4 5*/
          
         // outer loop
        for(int i=1; i<=5; i++){
            // inner loop
            for(int j=1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

        
    }
}