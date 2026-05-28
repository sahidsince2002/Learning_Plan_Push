class Calculator {
     public int add(int a,int b){
         int res = a+b;
         return res;

     }

}

class class1{
     public static void main(String []args){

          Calculator calc = new Calculator();

          System.out.println(calc.add(10,20));
     }
}