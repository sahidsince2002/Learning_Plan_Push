package shape;
import base.ShapeInterface;

public class Rectangle implements ShapeInterface {

    float length,breadth;

    public Rectangle(float length, float breadth){
       this.length=length;
       this.breadth=breadth;
    }


    public double area(){
        return length*breadth;
    }

    public double perimeter(){
        return 2*(length+breadth);
    }

}