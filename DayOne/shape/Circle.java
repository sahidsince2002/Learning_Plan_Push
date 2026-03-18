package shape;
import base.ShapeInterface;

public class Circle implements ShapeInterface {

    float radius;
    public Circle(float radius){
        this.radius=radius;
    }

     public double area(){
        return 3.14*radius*radius;
     }

     public double perimeter(){
        return 2*3.14*radius;
     }
}