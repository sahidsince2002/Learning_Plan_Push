
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListClass {
    public static void main(String[] args) {
        
        ArrayList <String> list = new ArrayList<>();

        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Violet");
        
        Iterator <String> itr =list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }


        // System.out.println("Colours : "+list);

        // for(int i=0;i<list.size();i++){
        //     System.out.println(list.get(i));
        // }


    }
}