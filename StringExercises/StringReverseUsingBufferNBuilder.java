public class StringReverseUsingBufferNBuilder {
    public static void main(String args[]){ 
      
        String str = "Sahid Ahmed";
        
        // Reversing Using String Buffer 
        StringBuffer sb = new StringBuffer(str);
        System.out.println(sb.reverse());
        
        //reversing using String Builder 
        StringBuilder sbr = new StringBuilder(str);
        System.out.println(sbr.reverse());
}
}
