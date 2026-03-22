public class mergeSortedArr {
    public static void main(String[] args) {
     int arr1[] = ArrayUtil.inputArr();
     int arr2[] = ArrayUtil.inputArr();

     int sortArr[]=new int[arr1.length+arr2.length];

     ArrayUtil.displayArr(mergeArr(arr1,arr2,sortArr));
     
     
    }

    public static int[] mergeArr(int arr1[],int arr2[],int sortArr[]){
        
       
        int i=0;
        int k=0;
        int j=0;
        
       while(i<arr1.length || j<arr2.length){
        if( j==arr2.length || (i<arr1.length && arr1[i]<arr2[j]) 
          ){
            sortArr[k]=arr1[i];
            i++;
            k++;
        }
        else {
             sortArr[k]=arr2[j];
             j++;
             k++;
        }
    }

        return sortArr;
    }
}
