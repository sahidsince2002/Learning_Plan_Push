import java.util.Arrays;

public class SortStringAlphabetically {
    public static void main(String[] args) {
        String strCaps = "Hello";
        String str =strCaps.toLowerCase();  // If not converted to lower case then the ASCII value hampers 
        char temp;
        char[] arr = str.toCharArray();

        // Approach 1 : With logic 
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(arr);

        // Approach 2: Using Arrays.sort()
        char[] newarr = str.toCharArray();
        Arrays.sort(newarr);
        System.out.println(newarr);

        
    }
}
