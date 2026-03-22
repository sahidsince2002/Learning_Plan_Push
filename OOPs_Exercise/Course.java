public class Course {
    
    String courseName;
    int i=0;
    static int maxCapacity=5;
    int isEnrolled;

    String[] enrolledStudents=new String[maxCapacity];

    
   
    Course(String courseName){
      this.courseName=courseName;
      
    }

    String[] enrollStudent(String[] studentName, int size){
           System.out.println("Array after Students enrolled are: ");
          
           if(size<maxCapacity)
           while(i<size){
           enrolledStudents[i]=studentName[i];
           i++;
           }
        
        else {
            return null;
        }
           return enrolledStudents;
    }

    void displayStudents(String[] enrolledStudentArr,int size){
        int j=0;
        while(j<size){
            System.out.print(" "+enrolledStudentArr[j]);
            j++;
        }
    }

    

    String[] unenrollStudent(String[] studentName,String[] newArr){
         System.out.println("Array after Student unenrolled");
         int i=0;
         String[]unrollarr = new String[maxCapacity];
         while(i<studentName.length){
            if(newArr[i]==studentName[i]){
                continue;
            }
            unrollarr[i]=newArr[i];
            i++;
         }

         return unrollarr;
    }

    static void setMaxCapacity(int maxCapacity){
        Course.maxCapacity=maxCapacity;
    }
    
    
    
    public static void main(String[] args) {
        Course c = new Course("java");
        String enrollArray[]={"Vishay","Anil"};
        int size = enrollArray.length;
        String newArr[]=c.enrollStudent(enrollArray,size);
        c.displayStudents(newArr,size);
        System.out.println();
        String unEnroll[]={"Anil"};
        int size2=unEnroll.length;
        String[] unEnrolled = c.unenrollStudent(unEnroll, newArr);
        c.displayStudents(unEnrolled, size2);

        // c.enrollStudent("Junaid");
        // c.enrollStudent("Dhiraj");
       // c.displayStudents();
       // c.unenrollStudent("Vishay");

        

    }
}
