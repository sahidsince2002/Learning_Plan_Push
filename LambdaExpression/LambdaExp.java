import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

interface Test {
    public int add(int a,int b);
}

interface Order {
    public void compare();
}

public class LambdaExp {
    
    //(a,b) -> {System.out.print(a+b);}
    
    
    public static void main(String[] args) {
       Test t = (a,b) -> a + b;
       int res = t.add(10,20);

       System.out.println(res);

       List <Integer> li = new ArrayList<>();
       li.add(20);
       li.add(100);
       li.add(10);
       li.add(50);
       li.add(80);


       Collections.sort(li, (a,b)->b-a);

       System.out.print(li+" ");


       //(int a,int b) -> {System.out.println(a+b);}
    }
}
