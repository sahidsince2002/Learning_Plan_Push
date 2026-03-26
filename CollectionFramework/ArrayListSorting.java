import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListSorting {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>();
        
        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Violet");
     
        Collections.sort(list);  // Sort arrylist in Alphabetical Order
        System.out.println(list);

         ArrayList <Integer> list2 = new ArrayList<>();
        
        list2.add(20);
        list2.add(10);
        list2.add(40);
        list2.add(30);
        Collections.sort(list2);  //Sort arrayList in Numeric Order 
        System.out.println(list2);
    }
}
