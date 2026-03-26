import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

public class PhoneBook {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num=0;
        String val=null;
        
        Map <Integer,String> contact = new HashMap<>();
        
        while(true){
        System.out.println("Choose the options - [1] Add contact [2] List of Contacts [3] Search by Number or name [4] Sort By Name ");
        int opt = sc.nextInt();
        switch(opt){
            case 1: System.out.println("Add contacts in key value pairs ");
                    contact.put(sc.nextInt(),sc.next());
                    break;

            case 2: System.out.println("Contacts : ");
                      for(Map.Entry<Integer,String> entry : contact.entrySet() ){
                       System.out.println(entry.getKey()+":"+entry.getValue());}
                       break;

            case 3: System.out.println("Enter Name or Number: ");
                    System.out.println("Press 1 for Number and 2 for Name: ");
                    int choose = sc.nextInt();
                    
                    if(choose == 1){
                    num = sc.nextInt();
                    } else {
                    val =sc.next();
                    }


                    for(Map.Entry<Integer,String> entry : contact.entrySet() ){
                        if(entry.getKey()==num || entry.getValue().equals(val)){
                       System.out.println("Contact found as "+entry.getKey()+" -> "+entry.getValue());
                       break;
                    }
                    //System.out.println("Not found");
                        }
                     
                     break;
            case 4: 
                      
                    //   ArrayList <String> value = new ArrayList<>(contact.values());
                    //   Collections.sort(value);

                    TreeSet <String> value = new TreeSet<>(contact.values());


                      for (String item : value) {
                        System.out.println(item);
                      }
                      break;
                      

            default: System.out.println("Enter valid options");
        }       
        }
    }
        // contact.put(100,"Vishal");
        // contact.put(102,"Vaibhav");
        // contact.put(103,"Vinit");
        // contact.put(104,"Viniti");
        
        
        // for(Map.Entry<Integer,String> entry : contact.entrySet() ){
        //     System.out.println(entry.getKey()+":"+entry.getValue());
        // }

        
    }

