class SortedOrNot{
    public static void main(String[] args){
        int arr[]={1,4,4,1,5};
        System.out.println(ifSorted(arr));

    }
    

    public static String ifSorted(int arr[]){
        int i=0;
        while(i<arr.length){
            while(i!=arr.length-1){
            if(arr[i]>arr[i+1]){
                return "Not Sorted";
            }
            i++;
           
        }
        i++;
        }

        return "Sorted";
    }

} 




        // while(i<arr.length){

        //     if(arr[i]<arr[i+1]){
        //         continue;
        //     }
        //     else {
        //       return "Not Sorted";  
        //     }
        //    i++;
        // }
        // return "Ended";