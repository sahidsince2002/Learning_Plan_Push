import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

public class LectureAttendence {
    static Scanner sc = new Scanner(System.in);

    public static void addStdn(ArrayList <Integer> list2,int range){
           
           System.out.println("Enter the Roll Number of Students came ");
           for(int i=0;i<range;i++){
            list2.add(sc.nextInt());
           }
    }
    
    public static void isPresent(ArrayList <Integer> list2, Map <Integer,String> list){
        for(Map.Entry<Integer,String> entry : list.entrySet()){
        if(list2.contains(entry.getKey())){
             System.out.println("Roll number "+entry.getKey()+"  "+entry.getValue()+" is present");

        }
        else {
             System.out.println("Roll number "+entry.getKey()+" "+entry.getValue()+" is Absent");
         }
        }
    }

    public static void search(Map <Integer,String> list, int roll){
      
        if(list.containsKey(roll)){
             System.out.println(list.get(roll)+" found in the Attendence System");
             return;
        }
        else {
             System.out.println(roll+" is not a valid roll number ");
             return;
         }
    }

    public static void sortContact(Map <Integer,String> list, ArrayList <Integer> list2){
         TreeSet<String> value = new TreeSet<>();
        for (Map.Entry<Integer,String> entry : list.entrySet()) {
            if(list2.contains(entry.getKey())){
               value.add(entry.getValue());
            }
        } 
        System.out.println(value);   

    }

    
    
    public static void main(String[] args) {
         int roll;  
         Map <Integer, String> list = new HashMap<>();

        list.put(101,"Biki");
        list.put(102,"Ayan");
        list.put(103,"Danish");
        list.put(104,"Vivek");
        list.put(105,"Rohan");
        list.put(106,"Simiriti");
        list.put(107,"Keshav");
        list.put(108,"Ujjain");
        list.put(109,"Jyoti");
        list.put(110,"Prakash");


        ArrayList <Integer> list2 = new ArrayList<>();
      
        while(true){
        
            
        System.out.println("Enter [1] to add students [2] to check if the student's are present or absent [3] to search student by Roll number [4] to sort by student name");
        int n = sc.nextInt();
       
        switch(n){
            
            case 1: System.out.println("Add students ");
                    System.out.println("Number of students came today: ");
                    int range = sc.nextInt();
                    addStdn(list2,range);
                    break;
            case 2: System.out.println("Roll numbers of students ");
                    isPresent(list2, list);
                    break;
            case 3: System.out.println("Searching Name on basis of roll number ");
                    roll = sc.nextInt();
                    search(list, roll);   
                    break;   
            case 4: System.out.println("Sorting Present Student based on Names ");
                    sortContact(list, list2);         
        }
       
    
    }
}
}