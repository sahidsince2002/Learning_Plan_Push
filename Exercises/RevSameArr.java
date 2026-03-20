// 12345 -> 52341 -> 54321 

// 1234 -> 4 2 3 1 -> 4 3 2 1 


public class RevSameArr {
    public static void main(String []args){
    int arr[]=ArrayUtil.inputArr();
    System.out.println("Reversed Array: ");
    ArrayUtil.displayArr(revSme(arr));

    }

    public static int[] revSme(int arr[]){

        int i=0;
        int j=arr.length-1;

        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        return arr;
    }
}
