class New{

    private int age;
    private String name;
    // Constructor 
    public New (){       // Default Constructor 
        System.out.print("Constructor called ");
    }

     public New (int a, String n){       // Parameterized Constructor 
       age = a;
       name = n;
       System.out.print("Constructor called");

    }

     public New (){       // Default Constructor 
       age=12;
       name="Jhon";
    }
}

class Constructor {
    public static void main(String[] args ){
          New nw = new New();
          New nw1 = new New(12,"Alice");
          System.out.println(age,name);


    }
}