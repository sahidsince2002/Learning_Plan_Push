import java.util.ArrayList;
import java.util.Collections;

public class ArrayListCopy {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>();
        
        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Violet");
     
       
        ArrayList <String> list2 = new ArrayList<>();
        
        list2.add("20");
        list2.add("10");
        list2.add("40");
        list2.add("30");

        Collections.copy(list2,list);
        System.out.println(list);
        System.out.println(list2);

    }
}
