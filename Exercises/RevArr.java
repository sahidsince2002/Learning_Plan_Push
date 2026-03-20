public class RevArr {
    public static void main(String[] args) {
        int arr[] = ArrayUtil.inputArr();
        int newArr[]=new int[arr.length];

        ArrayUtil.displayArr(revArr(arr,newArr));


        }

        public static int[] revArr(int arr[],int newArr[]){

           int i=0;
           int j=arr.length-1;

           while (i<arr.length) {
            newArr[j]=arr[i];
            i++;
            j--;
           }

          
            return newArr;
        }
    }


    

