abstract class A {
    abstract void show();   // abstract method 
    
}

class B extends A {            // concrete class (obj can be made)

    public void show(){
        System.out.println("a's defination");
    }  // Need to define it in non abstract class

    public void show1(){
        System.out.println("in B");
    }
}

class AbstractClass {
    public static void main(String [] args){

       A obj = new B();
       obj.show();
    }
}