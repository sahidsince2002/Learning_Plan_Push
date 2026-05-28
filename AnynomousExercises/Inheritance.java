class Calculator {


    public int add(int n1,int n2){
        return n1+n2;
    }

    public int sub(int n1,int n2){
        return n1-n2;
    }
}

class AdvCalculator extends Calculator{
    public int mult(int n1,int n2){
        return n1*n2;
    }

    public int div(int n1,int n2){
        return n1/n2;
    }
}

class Inheritance {
    public static void main(String args[]){
        AdvCalculator ac = new AdvCalculator();
        System.out.print(ac.sub(3,2)+" "+ ac.div(8,4));
    }
}