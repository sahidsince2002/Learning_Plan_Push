import java.util.Scanner;


class SumNAvgArray {
    public static void main(String[] args){

      int arr[] = ArrayUtil.inputArr();
      
      int sum=0;

      for(int i=0;i<arr.length;i++){
        sum+=arr[i];
      }
      int avg = sum/arr.length;
      System.out.println("Sum of all array elements: "+sum);
      System.out.println("Avg of all array elements: "+avg);

    }
}