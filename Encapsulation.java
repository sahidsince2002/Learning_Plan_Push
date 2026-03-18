class Student{
    //Instance variables 
    private String name;
    private int age;


    public void setName(String n){
        name = n;
    }

    public String getName(){
        return name;
    }

    public void setAge(int a){
        age = a;
    }

    public int getAge(){
        return age;
    }




}


class Encapsulation{
      public static void main(String args[]){


        Student st = new Student();
        st.setAge(23);
        st.setName("Sahid");
        

        System.out.println(st.getName()+" is "+st.getAge()+" years old");
      }


}

