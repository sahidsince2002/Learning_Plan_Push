

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

interface Comp {
    public void compare(int a,int b);
}
class Student {
    private String name;
    private int age;



    Student(String name,int age ){
       this.name = name;
       this.age = age;
    }



    public String getName() {
        return name;
    }



    public int getAge() {
        return age;
    }



    @Override
    public String toString() {
        return this.name+":"+this.age;
    }

    
}



public class LambdaSort {
    public static void main(String[] args) {

        Student stud1 = new Student("Manas", 21);
        Student stud2 = new Student("Hemango", 22);
        Student stud3 = new Student("Abhi", 21);
        Student stud4 = new Student("Madhuri", 19);

        List <Student> list = new ArrayList<>();

        list.add(stud1);
        list.add(stud2);
        list.add(stud3);
        list.add(stud4);

        Collections.sort(list,(a,b)->a.getAge() - b.getAge());
        System.out.println(list);
    }
}
