import java.util.ArrayList;
import java.util.Collections;

public class SwapArrList {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();

        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);

        Collections.reverse(list);  // to reverse the list
        System.out.println(list);

        Collections.swap(list, 1, 2);    // to swap the index element 
        list.reversed();
        System.out.println(list);

    }
}
