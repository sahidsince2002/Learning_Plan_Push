
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class NonRepeatingStr {
    public static void main(String[] args) {
        String name = "sammer";
        
        // // Approach 1: Without using Collection
        //  for(int i=0;i<name.length();i++){
        //     boolean unique = true;
        //     for(int j=0;j<name.length();j++){
        //         if(i != j && name.charAt(i)==name.charAt(j)){
        //           unique = false;
        //           break;
        //         }//else {System.out.println("The first non repeating character in the string is "+name.charAt(i));}
        //     }
        //     if(unique){
        //         System.out.println("The first non repeating character in the string is "+name.charAt(i));
        //         return;
                
        //     }
        //    // System.out.println();
        // }
        // System.out.println("No unique character exists");


        // Approach 2: Using Collections 

        HashMap<Character,Integer> newmap = new HashMap<>();
        
        for(int i=0;i<name.length();i++){
            char ch = name.charAt(i);
            if(newmap.containsKey(ch)){
                newmap.put(name.charAt(i),newmap.get(ch)+1);
            }else {
                newmap.put(ch,1);
            }
        }
        System.out.println(newmap);

        for (Entry <Character,Integer> entrySet : newmap.entrySet()) {
            if(entrySet.getValue()==1){
                System.out.println(entrySet.getKey());
                break;
            }
        }
    }
}
