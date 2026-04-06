class FieldFinal {
    final int age;
    final String name;

    FieldFinal(int age,String name){
        this.age = age;
        this.name=name;
    }

    public void display(){
        
        System.out.println(age);
    }


}

public class FinalFields{
    public static void main(String[] args) {
        FieldFinal ff = new FieldFinal(21,"Abdul");
        ff.display();
    }
}