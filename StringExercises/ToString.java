// Take two fields name and age from student class and display it using toString()

class StudentString{

     String name;
     int age;

     StudentString(String name,int age){
        this.name=name;
        this.age=age;
     }

    public String toString(){
       // return "Name: "+name+" Age: "+age;
       return "Name: "+name
               +", Age: "+age;
     }

    

}



public class ToString {
    
  
    public static void main(String[] args) {
        StudentString str = new StudentString("Rohit", 13);
        System.out.println(str);
    }
}