//package Records;

record Student(String name,int age) {
    public Student{
     if(name.isEmpty()){
        throw new IllegalArgumentException("Name cannot be null");
     }
    }
}
public class RecordExample {
    public static void main(String[] args) {
        
    
    Student st = new Student("Alice",24);
    Student st2 = new Student("Bob",22);
    Student st3 = new Student("",0);



    System.out.println(st.name());
    System.out.println(st2.age());
    System.out.println(st3);

    


    }
}
