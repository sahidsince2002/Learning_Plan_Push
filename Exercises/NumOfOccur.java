class NumOfOccur {
      public static void main(String[] args){
        int arr[] = ArrayUtil.inputArr();

        int n = 10;
        int i=0;
        int count =0;
        while(i<arr.length){
            if(arr[i]==n){
                count++;
            }
            i++;
        }

        System.out.println(count);
      }


}