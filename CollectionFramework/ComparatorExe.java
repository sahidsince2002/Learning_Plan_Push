import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class CompareExe implements Comparator<String> {
   
    public int compare(String o1,String o2){
       // return o2-o1;
        return o1.compareTo(o2);
    }
}


public class ComparatorExe {
    public static void main(String[] args) {
        // List <Integer> list = new ArrayList<>();
        // list.add(10);
        // list.add(11);
        // list.add(11);
        // list.add(15);
        // list.add(1);
        // list.add(23);

         List <String> list = new ArrayList<>();
        list.add("Banana");
        list.add("Grapes");
        list.add("Apple");
        list.add("Papaya");
        list.add("Emily");
        list.add("Chiku");





        
        list.sort(new CompareExe());
        System.out.println(list);

    }
}
