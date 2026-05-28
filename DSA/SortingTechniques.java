// 10 9 8 7 6 5
// 9 10 8 7 6 5 
// 9 8 10 7 6 5
// 9 8 7 10 6 5 
// 9 8 7 6 10 5
// 9 8 7 6 5 10

public class SortingTechniques {
    public static int BubbleSort(){
        int[] arr = { 10, 9, 8, 7, 6, 5 };
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                count++;
               if(arr[i]>arr[j]){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
               }
            }
        }
        for (int item : arr) {
            System.out.print(" "+item);

        }
            System.out.print("\n "+count);

        return -1;
        
    }

    public static int InsertionSort(){
        int[] arr = { 10, 9, 8, 7, 6, 5 };
        int key;
        int j;
        int count=0;

        for(int i=1;i<arr.length;i++){
             key = arr[i];
             j= i-1;
            
            while(j>=0 && (arr[j] > key)){
              count++;
              arr[j+1]=arr[j];
              j--;
            }
            arr[j+1]=key;
        }
        for (int item : arr) {
            System.out.print(" "+item);
        }
        System.out.print("\n "+count);

        return -1;

    }

    /*
     5 6 1 2 3 
     1 6 5 2 3
     1 5 6 2 3
     1 2 6 5 3
     1 2 3 5 6
     1 2 3 5 6
    
    */

     public static int SelectionSort(){
        int[] arr = {5,6,1,2,3};
     
        
        for(int i=0;i<arr.length-1;i++){
         int min = i;
        
            for(int j=i+1;j<arr.length;j++){
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
        for (int i : arr) {
            System.out.print(" "+i);
        }
        return -1;

     }
     public static int partition(int arr[], int low, int high){
         int piv = arr[high];
        
         int i = low-1;

         for(int j=low;j<high;j++){
            if(arr[j] < piv){
               i++;
               int temp = arr[i];
               arr[i]=arr[j];
               arr[j]=temp;
            }
         }
         int temp = arr[i+1];
         arr[i+1]=arr[high];
         arr[high]=temp;

         return i+1;
     }

     public static void quickSort(int[] arr, int low, int high){
          
       
        if(low < high){
            int part = partition(arr,low,high);

            quickSort(arr, low, part-1);
            quickSort(arr, part +1, high);

          }
          
     }

     public static void mergeSort(int[] arr, int l, int r){
          if(l<r){
            int mid = (l+r)/2;

            mergeSort(arr,l,mid);
            mergeSort(arr,mid+1,r);
            merge(arr,l,mid,r);
          }
     }

     public static void merge(int[]arr,int l,int mid,int r){

        int size1 = mid - l +1;
        int size2 = r-mid;

        int lArr[] = new int[size1];
        int rArr[] = new int[size2];

        for(int i=0;i<size1;i++){
            lArr[i]=arr[l+i];

        }

        for(int j=0;j<size2;j++){
            rArr[j]=arr[mid+1+j];
        }

        int x=0;
        int y=0;
        int k=l;

        while(x<size1 && y<size2){
            if(lArr[x] <= rArr[y]){
                arr[k]=lArr[x];
              
                x++;
            }
            else {
                arr[k]=rArr[y];

                y++;
            }
            k++;
        }
        while(x<size1){
            arr[k]=lArr[x];
            x++;
            k++;
        }

         while(y<size2){
            arr[k]=rArr[y];
            y++;
            k++;
        }
     }

    public static void main(String[] args){
        System.out.println("\nBubble Sorting");
        BubbleSort();
        System.out.println("\nInsertion Sorting");
        InsertionSort();
        System.out.println("\nSelection Sorting");
        SelectionSort();
        System.out.println("\nQuick Sorting ");

        int[] arr = {5,6,1,2,3};
        quickSort(arr,0,arr.length-1);
        for (int i : arr) {
            System.out.print(" "+i);
          }

        System.out.println("\nMerge Sorting ");

        int arr2[] ={8,6,2,4,6,7,1};
        mergeSort(arr2, 0, arr2.length-1);
        for (int i : arr) {
            System.out.print(" "+i);
          }


    }
}