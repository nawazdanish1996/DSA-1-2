public class threeString {
    
    public static void main(String args[]){

        // subString()
        /*
         * Definition of subString()
         * 
         * substring(begIndex, endIndex):
         * This method has two variants and returns a
         * new string that is a substring of this string.
         * The substring begins with the character at the
         * specified index and extends to the end of this
         * string or up to endIndex – 1 if the second
         * argument is given. 
         */

        String sentence = "My name is Nawaz Danish";
        String name = sentence.substring(0, 5);
        String name1 = sentence.substring( 5);
        System.out.println(name);
        System.out.println(name1);

        /*
         * Note:
         * The string is immutable means that
         * we cannot change the object itself,
         * but we can change the reference to the object.
         */
    }
}
