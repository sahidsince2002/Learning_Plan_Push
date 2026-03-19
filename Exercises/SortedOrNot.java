class SortedOrNot{
    public static void main(String[] args){
        int arr[]=ArrayUtil.inputArr();
        System.out.println("If Array sorted in Ascending:"+ifSortedAsc(arr));
        System.out.println("If Array sorted in Descending:"+ifSortedDesc(arr));

    }
    

    public static String ifSortedAsc(int arr[]){
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

      public static String ifSortedDesc(int arr[]){
        int i=0;
        while(i<arr.length){
            while(i!=arr.length-1){
            if(arr[i]<arr[i+1]){
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