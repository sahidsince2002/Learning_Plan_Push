public class VarArgsEx {
    
    static String concat(String... str){  
        StringBuilder sb = new StringBuilder();
        for (String string : str) {
          
           sb.append(string);
        }
        return sb.toString();
        // String newStr = str[0]+str[1]+str[2];
        // return newStr;
    }
    
    public static void main(String[] args) {
       // System.out.println();
       System.out.println(concat("Sahid "," Ahmed"," Laskar"));
    }
}
