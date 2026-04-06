import java.util.ArrayList;
import java.util.Collections;

public class FrequencyList {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();

        list.add(10);
        list.add(10);
        list.add(10);
        list.add(10);

       System.out.println( Collections.frequency(list, 10));

    }
}
