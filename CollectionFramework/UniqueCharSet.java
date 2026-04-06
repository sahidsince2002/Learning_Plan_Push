import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueCharSet {
    public static void main(String[] args) {
        Set <Character> ch = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String ");
        String unique = sc.nextLine();    // to include spaces as character 
        System.out.println("String entered is : "+unique);

        for(int i=0;i<unique.length();i++){
            if(unique.charAt(i)!=' '){
            ch.add(unique.charAt(i));
            }
        }
        System.out.println(ch);
        
       System.out.println("Number of unique characters in the string is : "+ch.size());
        
    }
}
