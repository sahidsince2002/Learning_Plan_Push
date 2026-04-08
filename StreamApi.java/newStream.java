// package StreamApi.java;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class newStream {
   public static void main(String[] args) {
    List <Integer> list = List.of(2,10,9,7,16);
    List <Integer> list2 = Arrays.asList(2,10,9,7,16);

    
    List <Integer> newlist = list2.stream().filter(i -> i%2==0).collect(Collectors.toList());
    System.out.println(newlist);
    List <Integer> newlist2 = list.stream().filter(i -> i>10).collect(Collectors.toList());
    System.out.println(newlist2);
    
   int []arr = {1,2,3,4,5};
   Arrays.sort(arr);

   // for (int j : arr) {
   //    System.out.println(arr[j]);
   // }
   List<Integer> newList3 = Arrays.stream(arr).filter(i -> i%2==0).boxed().collect(Collectors.toList());
   System.out.println(newList3);
   
   double val = Arrays.stream(arr).average().orElse(0);
   System.out.println(val);
   double val2 = list.stream().mapToInt(Integer::intValue).average().orElse(0);
   System.out.println(val2);
   
   }
}
