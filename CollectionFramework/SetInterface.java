import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SetInterface {
    public static void main(String[] args) {
        Set <String> names = new HashSet<>();
        
        names.add("Kannan");
        names.add("Prashant");
        names.add("Karan");
        names.add("Kiran");

        Set <Integer> num = new HashSet<>();

        num.add(10);
        num.add(9);
        num.add(12);

        
        System.out.println(num);

        System.out.println(names);

        for(String n : names){
            System.out.print(" "+n);
        }

    }
}
