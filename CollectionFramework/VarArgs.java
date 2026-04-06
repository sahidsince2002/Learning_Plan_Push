public class VarArgs {
    
    public static void printAll(int... a){
         for (int a2 : a) {
            System.out.println(a2);
         }
    }
   
    public static void main(String[] args) {
        printAll(1);
        printAll(1,2,3);
        printAll(1,2,4,5,6,7);
    }
}
