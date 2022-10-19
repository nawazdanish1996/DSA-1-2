class Print{

    public static void main(String args[]){
        // Print Largest Number
        int a =1, b=3, c=6;

        if((a>=b) && (a>=c)){
            System.out.println(a);
        }
        else if((b>a) && (b>c)){
            System.out.println(b);
        }
        else if((c>a) && (c>b)){
            System.out.println(c);
        }
        else{
            System.out.println("Null");
        }

    }
}