class MaxMinArray{

    public static void main(String []args ){
        System.out.println("Max and Min of element in array");
        int []arr = ArrayUtil.inputArr();
        int size = arr.length;
        int i=0;
        int maxm=0;
        int minm=arr[size-1];

        System.out.println("The Maximum Element in the array is :"+max(arr,size,maxm,i));
        System.out.println("The Minimum Element in the array is :"+min(arr,size,minm,i));
    }


        public static int max(int[] arr,int size,int maxm,int i) {

            
            while(i<size){
               
              if(arr[i] > maxm){
                maxm = arr[i];
              }
               
               i++;
            }
            return maxm;    
        }

        public static int min(int[] arr,int size,int minm,int i) {

            
            while(i<size){
               
              if(arr[i] < minm){
                minm = arr[i];
              }
               
               i++;
            }
            return minm;    
        }
    }
