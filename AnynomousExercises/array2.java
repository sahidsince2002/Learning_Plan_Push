import java.util.Scanner;

class array2{
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int num[] = new int[n];

        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }

        for(int i : num){
         System.out.print(i+" ");
        }
     }

}