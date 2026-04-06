import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapPractice {
    public static void main(String[] args) {
        Map <Integer,String> map = new TreeMap();
        
        map.put(10,"apple");
        map.put(20,"orange");
        map.put(30,"kiwi");
        map.put(40,"grapes");
        
        System.out.println(map);
    }
}
