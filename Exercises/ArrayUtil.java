import java.util.Scanner;

public class ArrayUtil {

    public static int[] inputArr(){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the Array Size");
      int size = sc.nextInt();
     System.out.println("Input elements: ");
      int arr[]= new int[size];
      for(int i=0;i<size;i++){
        arr[i]=sc.nextInt();
      }

     return arr;
}


    public static void displayArr(int arr[]){
      int i=0;
      while(i<arr.length){
        System.out.print(" "+arr[i]);
        i++;
      }
    }
}