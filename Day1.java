interface Shape {
    double area();
    double perimeter();

}

class Circle implements Shape {

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

class Rectangle implements Shape {

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

class Triangle implements Shape {

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


class Day1{
    public static void main(String[] args){

     Circle cr = new Circle(10);
     Rectangle re= new Rectangle(10,10);
     Triangle tr = new Triangle(10,10,10);

     System.out.println(cr.area());
     System.out.println(re.area());
     System.out.println(tr.area());
     System.out.println(tr.perimeter());
   
     
     //System.out.println("The Area of Circle is : "+ cr.area()+" and perimeter is :"+cr.perimeter());
     

    }
}