//import java.util.Arrays;

class array {
     public static void main(String[] args){
        int arr[][] = new int[3][4];
        int count=0;

        for (int i=0;i<3;i++){
            System.out.println();
            for(int j=0;j<4;j++){
                arr[i][j]=count+1;
                count++;
                System.out.print("   "+arr[i][j]);
            }
        }
     }

}