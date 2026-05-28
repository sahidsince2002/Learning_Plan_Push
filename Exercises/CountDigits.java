// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class CountDigits {
    public static void main(String[] args) {
     
     countDigit(100011411);
      
           
       }
       
       public static int countDigit(int num){
          int count=0;
  
          while(num != 0){
              int rem = num % 10;
              num =  num / 10;
              count++;

              
          }
          System.out.print(count);
        
        return -1;
        
       }
}
    
