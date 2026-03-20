import java.util.Scanner;

class NumOfOccur {
      public static void main(String[] args){
        int arr[] = ArrayUtil.inputArr();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check for occurences : ");
        int num = sc.nextInt();
        System.out.println(numOfocc(arr, num));

      }
        

    public static int numOfocc(int arr[],int num){
        
        int i=0;
        int count =0;
        while(i<arr.length){
            if(arr[i]==num){
                count++;
            }
            i++;
        }

       return count;
      }
    }


