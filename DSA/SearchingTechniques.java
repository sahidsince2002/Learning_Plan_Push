package DSA;

public class SearchingTechniques {
    public static void linearSearch(int arr[],int target){
        boolean flag = true;
        if(arr.length == 0){
            System.out.println("Array is empty");
        }else {
            for(int i=0;i<arr.length;i++){
                if(arr[i]==target){
                    System.out.println("Element found in index "+i);
                    flag = true;
                    break;
                }else {
                    flag = false;
                }
            }
            if(!flag){
                System.out.println("Element not found in array");
            }

        }
    }

    public static void binarySearch(int arr[],int target){
        
        int left = 0;
        int right = arr.length-1;
        while (left <= right){
            int mid = (left + right)/2;
            if(arr[mid] == target){
                System.out.println("Element found in index "+mid);
                break;
            }
            else if(arr[mid] > target){
                right = mid-1;
            }
            else {
                left = mid+1;
            }
        }
}

    public static void main(String[] args) {
        int arr[] = {10,20,30,44,50,67,89};
        linearSearch(arr, 7);
        binarySearch(arr, 44);

    }

}
