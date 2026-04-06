public class NonRepeatingStr {
    public static void main(String[] args) {
        String name = "sammer";

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
                return;
                
            }
           // System.out.println();
        }
        System.out.println("No unique character exists");
    }
}
