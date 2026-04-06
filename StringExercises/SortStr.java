import java.util.ArrayList;
import java.util.Collections;

public class SortStr {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>();
        list.add("Kang");
        list.add("Ling");
        list.add("Dravid");
        
        System.out.print(list);
        Collections.sort(list);
        System.out.print(list);

    }
}
