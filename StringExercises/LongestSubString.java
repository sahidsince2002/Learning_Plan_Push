// Longest string length withing a string which has no repeated characters 

// aabbcdee -> bcde [length=4]
// abbcddee  -> bcd [length = 3]... etc 

public class LongestSubString {
    public static void main(String[] args){

       String str = "abbcddee";
        String result = "";

        for(int i=0;i<str.length();i++){
            StringBuilder sb = new StringBuilder();

            for(int j=i;j<str.length();j++){
                if(sb.indexOf(String.valueOf(str.charAt(j))) != -1){
                    break;
                } else {
                    sb.append(str.charAt(j));
                }
            }

            if(sb.length() > result.length()){
                result = sb.toString();
            }
        }

        System.out.print(result);
            }
      
    }
