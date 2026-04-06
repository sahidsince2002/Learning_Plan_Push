import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapCountry {
    public static void main(String[] args) {
        
    
    Map <String,String> map = new HashMap<>();

    map.put("India","Delhi");
    map.put("China","Bejing");
    map.put("France","Paris");
    map.put("USA","NewYork");

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Country");
    String check = sc.next();
    if(map.containsKey(check)){
        System.out.println(map.get(check));
    }else {
        System.out.println(check+" doesn't exists");
    }
    }
}
