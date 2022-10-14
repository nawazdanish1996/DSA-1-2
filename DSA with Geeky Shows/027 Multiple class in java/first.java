class secondClass{
    int a,b,total;

    void add(){
        total = a + b;
    }
}


class firstClass {

    public static void main(String args[]){
        secondClass obj = new secondClass();

        obj.a = 10;
        obj.b = 20;
        obj.add();
        System.out.println(obj.total);

    }
}