public class twoString {
    
    public static void main(String args[]){
        // compareTo()
        /*
            The compareTo() method compares two strings
            lexicographically.

            The comparison is based on the Unicode value
            of each character in the strings
         * 
         */

         String name1 = "Raja";
         String name2 = "Rana";
        //  System.out.println(name1.compareTo(name2));
        if(name1.compareTo(name2) == 0){
            System.out.println("You are Equal");
        }else{
            System.out.println("You are not Equal");
        }
    }
}
