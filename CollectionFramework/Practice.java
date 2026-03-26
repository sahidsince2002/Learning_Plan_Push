import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        // ArrayList <String> list = new ArrayList<>();
        Map <String, Integer> list = new HashMap<>();
        
        Scanner sc = new Scanner(System.in);
        list.put(sc.next(),sc.nextInt());
        list.put(sc.next(),sc.nextInt());

       
    // }

     for (Entry<String, Integer> entry : list.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}



