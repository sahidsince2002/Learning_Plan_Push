// Java Course -> avaj esruoc

/*
1. Split the string based on " " and store it in a string array
2. Outer loop through all the element in the String arr ["Java","Course"]
3. For each element in the arr print reverse characters using inner loop


*/
public class ReverseEachWord {
    public static void main(String[] args){
        String str = "joke course";
        String[] words = str.split(" ");

        for(int i=0;i<words.length;i++){
           System.out.print(" ");
           for(int j=words[i].length()-1;j>=0;j--){
            System.out.print(words[i].charAt(j));
        }
            
        } 
       
        
    }
}