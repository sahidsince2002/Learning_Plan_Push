

import base.*;
import shape.*;




class Run{
    public static void main(String[] args){

     ShapeInterface cr = new Circle(10);
     ShapeInterface re= new Rectangle(10,10);
     ShapeInterface tr = new Triangle(10,10,10);

     System.out.println("Area of circle: "+cr.area());
     System.out.println("Area of Rectangle: "+re.area());
     System.out.println("Area of Triangle: "+tr.area());
     System.out.println("Perimeter of Triangle: "+tr.perimeter());
    }
}