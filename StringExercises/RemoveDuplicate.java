import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicate {
   public static void main(String[] args) {
    
   
    String str = "Mississipi";
    String str2="";
   // Approach 1 : Using Logic
    for(int i=0;i<str.length()-1;i++){
       boolean flag = false;
        for(int j=i+1;j<str.length()-1;j++){
           if(str.charAt(i)==str.charAt(j)){
              flag = true;
           }
        }
        if(flag==false){
            str2 = str2 + str.charAt(i);
        }
    }
    System.out.println(str2);
    
    //Approach 2: Using StringBuilder 

   StringBuilder sb = new StringBuilder();
   str.chars().distinct().forEach(c->sb.append((char)c));
   System.out.println(sb);

   //Approach 3: Using StringBuilder for loop

   StringBuilder sb2 = new StringBuilder();
   char [] arr = str.toCharArray();

   for(int i=0;i<arr.length;i++){
      boolean flag = false;
      for(int j =i+1;j<arr.length;j++){
         if(arr[i]==arr[j]){
            flag = true;
         }
      }
      if(!flag){
      sb2.append(arr[i]);
   }
   }
   System.out.println(sb2);

   // Approach 4: using Set 

   Set<Character> set = new LinkedHashSet<>();
   for(int i=0;i<str.length();i++){
      set.add(str.charAt(i));
   }

   for (Character character : set) {
      System.out.print(character);
   }
  // System.out.println(set);
   
}
}
