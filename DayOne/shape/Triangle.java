package shape;
import base.ShapeInterface;
public class Triangle implements ShapeInterface {

    float base,height,length;

     public Triangle(float base, float height,float length){
       this.base=base;
       this.height=height;
       this.length=length;
    }

    public double area(){
        return 0.5*base*height;
    }

    public double perimeter(){
        return base+length+height;
    }

}