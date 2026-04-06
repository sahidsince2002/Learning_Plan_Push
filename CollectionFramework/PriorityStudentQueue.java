import java.util.Comparator;
import java.util.PriorityQueue;

class Student {
    String name;
    int grade;
    
    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", grade=" + grade + "]";
    }
    

    
}


public class PriorityStudentQueue {
    
    public static void main(String[] args) {
        
    
    PriorityQueue <Student> stud = new PriorityQueue<>(new Comparator<Student>(){

    public int compare(Student s1, Student s2){
          return s1.getGrade() - s2.getGrade();
    }
    });

    stud.offer(new Student("Ankit",12));
    stud.offer(new Student("Anjali",10));
    stud.offer(new Student("Aman",7));
    stud.offer(new Student("Ankur",8));

      System.out.printf("Queue is: %s\n", stud);
        System.out.printf("Got %s\n", stud.poll());
        System.out.printf("Got %s\n", stud.poll());
        System.out.printf("Got %s\n", stud.poll());
        System.out.printf("Got %s\n", stud.poll());
        System.out.printf("Got %s\n", stud.poll());


}

}

//   Comparator <Student> comp = new Comparator<Student>(){
//     public int compare(Student i,Student j){
//         if(i.getGrade()>j.getGrade()){
//             return 1;
//         }else {
//             return -1;
//         }
//     }
//   };

//     PriorityQueue <Student> studs= new PriorityQueue<>();
   
//     studs.add(new Student("Ajay",12));
//     studs.add(new Student("Vivek",32));
