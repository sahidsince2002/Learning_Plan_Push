import java.lang.Math;
import java.text.DecimalFormat;

public class MathPI {


    static double area(int radius){
       return Math.PI * radius * radius;
    }

    static double circumference(int radius){
       return Math.PI * radius * 2;
    }
    
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("0.00");  // would only allow 2 digits after decimal

        System.out.println("The Area of circle is :"+df.format(area(10)));
        System.out.println("The Circumference of Circle is :"+df.format(circumference(10)));
    }
}
