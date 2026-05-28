import java.util.Scanner;

class switchProg {
     public static void main(String[] args){

        for (int i=0;i<12;i++){
         System.out.println();
         switch(i){
            case 0: System.out.print("January");
            break;

            case 1: System.out.print("February");
            break;

            case 2: System.out.println("March");
            break;

            case 3: System.out.println("April");
            break;

            case 4: System.out.println("May");
            break;

            case 5: System.out.println("June");
            break;

            case 6: System.out.println("July");
            break;

            case 7: System.out.println("August");
            break;

            case 8: System.out.println("September");
            break;

            case 9: System.out.println("October");
            break;   

            case 10: System.out.println("November");
            break;

            case 11: System.out.println("December");
            break;

            

         }
         int last=0;
         if(i==0 || i==2 || i==4 || i==6 || i==7 || i==9 || i==11){
            last = 31;
         }
         else if(i==1){
            last = 28;
             
         }
         else{
            last = 30;
         
         }

         for(int j=0;j<last;j++){
            if(j%7==0){
               System.out.println();
            }
            System.out.print(j+1+" ");
         }

      
        }





     }


}