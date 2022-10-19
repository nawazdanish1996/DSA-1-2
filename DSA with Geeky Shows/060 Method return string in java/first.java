class firstClass{

    public static void main(String args[]){
        secondClass obj = new secondClass();
        System.out.print(obj.fname());
        System.out.print(" ");
        System.out.print(obj.lname("Danish"));
    }
}

class secondClass{
    String fname(){
        String a = "Nawaz";
        return a;
    }

    String lname(String b){
        String str = b;
        return str;
    }
}