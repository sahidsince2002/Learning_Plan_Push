package ExceptionHandling;

public class ExceptionClass {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int arr2 [] = {2,4,6,0,8};
       
        
        try {
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(divide(arr[i],arr2[i]));
        }
    }catch(ArithmeticException ae){
            System.out.println(ae.getMessage());
            
        }
    
    }

    public static int divide(int a,int b){
        if(b==0){
            throw new ArithmeticException("Cannot Divide by zero");
        }
        return a/b;
    }
}
try {
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(divide(arr[i],arr2[i]));
        }
        }catch(Exception e){
            System.out.println("Divide by zero exception");
            return;
        }
        finally{
            System.out.println("Will print regardless ");
            
        }