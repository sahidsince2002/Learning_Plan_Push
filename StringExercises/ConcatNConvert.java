
// Take two strings concate both of them and return in Uppercase 

class Concat {
    String s1;
    String s2;
   Concat(String s1, String s2){
       this.s1=s1;
       this.s2=s2;
   }
   

   public String concat(){
    //   String newstr = s1 +" "+ s2;   can do it like this or 
    String newstr = s1.concat(" ").concat(s2);    // like this 
      return newstr;
   }

}

public class ConcatNConvert {
    public static void main(String[] args) {
        Concat c = new Concat("Ramesh", "Tiniali");
        System.out.println(c.concat().toUpperCase());


    }
}