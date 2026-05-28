public class ReplaceCharWithOccur {

    public static void replace(String str, char ch, int count){
         for(int i=0;i<str.length();i++){
            if(str.isEmpty()){
                System.out.println("The string is empty");
                break;
            }
            else if(str.indexOf(ch)==-1){     // If character isn't present the function will return -1 
                System.out.println("The character isn't present in the string");
                break;
            }else {
            if(str.charAt(i)==ch){
                count++;
                System.out.print(count);
            }else{
                System.out.print(str.charAt(i));
            }
        
        }
        // if(count==0){
        //     System.out.printf("\nThe character %c is absent in the String",ch);
        // }
    }

    }


    public static void main(String[] args) {
        String str = "Kelly";

        char ch ='z';
        int count =0;
        replace(str,ch,count);
       
    }
}
