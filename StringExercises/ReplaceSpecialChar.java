public class ReplaceSpecialChar {
    public static void main(String args[]){
        String str = "$@h!d @hmed L@$kar";

        System.out.println(str.replaceAll("[^a-zA-Z0-9]",""));
        String str2 = " Sahid Ahmed Laskr ";
        
        System.out.println(str.replace(str, str2));

        System.out.println(str2.trim()); // Will replace whitespace starting and ending 
        
        String trimmed = str2.replaceAll("\\s", "");
        System.out.println(trimmed);
    }
}