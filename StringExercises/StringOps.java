import java.lang.String;
import java.util.Arrays;

public class StringOps {
    public static void main(String[] args) {
        String name = "sammer";
        name = name.toLowerCase();
        System.out.println();
    
        for(int i=0;i<name.length();i++){
            System.out.print(" "+name.charAt(i));    // to print the characters of string 
        }
        // System.out.println(name);
        System.out.println();
        for (char ch : name.toCharArray()) {
            System.out.print(" "+ch);                // to convert the string into char array and then print 
        }
        System.out.println();
        for(int i=name.length()-1;i>=0;i--){
            System.out.print(" "+name.charAt(i));    // to print the characters of string in rev order 
        }
        System.out.println();
        for(int i=name.length()-1;i>=0;i--){
            if(i==2){continue;}
            System.out.print(" "+name.charAt(i));
                // to print the characters of string in rev order 
        }
    System.out.println();
        for(int i=0;i<name.length();i++){
            for(int j=name.length()-1;j>=0;j--){
                if(name.charAt(i)==name.charAt(j)){
                    i++;
                }else {
                    System.out.println("Not a palindrome");       // To check if a string is palindrome 
                    return;
                }
            }
            System.out.println("Palindrome");
        }

        System.out.println();

        for(int i=0;i<name.length();i++){
            boolean unique = true;
            for(int j=0;j<name.length();j++){
                if(i != j && name.charAt(i)==name.charAt(j)){
                  unique = false;
                  break;
                }//else {System.out.println("The first non repeating character in the string is "+name.charAt(i));}
            }
            if(unique){
                System.out.println("The first non repeating character in the string is "+name.charAt(i));
                break;
            }
           // System.out.println();
        }

        // STRING SORTING 
        char[] arr = name.toCharArray();
        Arrays.sort(arr);
        String var = new String(arr);

        System.out.println(var);

    }


   //STRING REVERSAL USING OPTIMIZED APPROACH

class Main {
    public static void main(String[] args) {
        String name = "sahid";
        char arr[] = name.toCharArray();
        int low = 0;
        int high = name.length() -1 ;
        
        while(low < high) {
            char temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            
            low++;
            high--;
        }
        System.out.print(arr);


        
    }
}
}
