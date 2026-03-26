
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;
import java.util.TreeSet;

class Contacts {
       
     int num=0;
     String val=null;
     Scanner sc = new Scanner(System.in);

     public void addContact(Map <Integer,String> contact){
        
        System.out.println("Add contacts in key value pairs ");
        contact.put(sc.nextInt(),sc.next());
     }

     public void listOfContacts(Map <Integer,String> contact){
        System.out.println("Contacts : ");
        for(Map.Entry<Integer,String> entry : contact.entrySet() ){
        System.out.println(entry.getKey()+":"+entry.getValue());}
     }

     public void search(Map <Integer,String> contact){
                   
                    System.out.println("Enter Name or Number: ");
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
     }


}
    public void sortContact(Map <Integer,String> contact){
            TreeSet <String> value = new TreeSet<>(contact.values());


                      for (String item : value) {
                        System.out.println(item);
                      }
    }
}

public class PhoneBookAdv {
    public static void main(String[] args) {
        Contacts c = new Contacts();
        Map <Integer,String> contact = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        while(true){
        System.out.println("Choose the options - [1] Add contact [2] List of Contacts [3] Search by Number or name [4] Sort By Name ");
        int opt = sc.nextInt();
        switch(opt){
            case 1: c.addContact(contact);
                    break;
            case 2: c.listOfContacts(contact);
                    break;
            case 3: c.search(contact);
                    break;
            case 4: c.sortContact(contact);
                    break;
            default: System.out.println("Enter valid options");
        }       
        }
    }
}