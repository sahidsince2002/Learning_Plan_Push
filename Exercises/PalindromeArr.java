// 1001 , 110011


public class PalindromeArr {
    public static void main(String []args ){
      int arr[]=ArrayUtil.inputArr();
      if(palindArr(arr)==false){
      System.out.println("Array is not Palindrome");
      }
      else {
        System.out.println("Array is Palindrome");
      }
    }

    public static boolean palindArr(int arr[]){

        int i=0;
        int j=arr.length-1;

        while(i<j){
            if(arr[i]==arr[j]){
                i++;
                j--;
            }
            else {
                return false;
            }
        }

        return true;
    }
}
