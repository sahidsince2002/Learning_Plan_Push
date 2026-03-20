import java.util.Scanner;

public class DeleteElement {
      public static void main(String []args){
         int arr[] = ArrayUtil.inputArr();
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the element to delete : ");
         int n=sc.nextInt();
         int newArr[] = delOps(arr, n);
         System.out.println("Newly Array with Deleted item : ");
         ArrayUtil.displayArr(newArr);
      }   
      
      public static int[] delOps(int arr[],int n){
           
          int occur = NumOfOccur.numOfocc(arr, n);
          int newArrSize = arr.length - occur;
          int newArr[]=new int[newArrSize];
          int j=0;

          for(int i=0;i<arr.length;i++){          
                if(arr[i]==n){           // checking if the element from old array is the element to delete 
                    continue;            // skipping the index if its the same element 
                }   
                newArr[j]=arr[i];       // copying elements from old array to new array
                j++;                     // increasing j only if the items are unique 
            
          }
          return newArr;

      }
       
      }

