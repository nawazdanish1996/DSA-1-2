class firstClass{ // main class
    
    public static void main(String args[]){
        Test obj = new Test();
        System.out.println("Addition: "+obj.add());
        int r = obj.mult(5);
        System.out.println("Multiplication: "+r);
    }
}

    class Test{  // child class

        int add(){ // Instance method without parameter
            int a=10, b=5; // local variable
            return (a+b);
        }

        int mult(int p){ // instance method with parameter
            int k =p; // local variable
            return (k*k);
        }
    }