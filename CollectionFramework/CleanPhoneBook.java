import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

class Contact {
    private String fname;
    private String lname;
    private int number;


    

    public Contact(String fname, String lname, int number) {
        this.fname = fname;
        this.lname = lname;
        this.number = number;
    }

    public String getFname() {
        return fname;
    }
    public String getLname() {
        return lname;
    }
    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Contact [fname=" + fname + ", lname=" + lname + ", number=" + number + "]";
    }

    public static void addContact(Map <Integer,Contact> contact,int key,Contact con){
      contact.put(key, con);
      System.out.println("Contact Added Successfully ");
      return;
      
    }

    public static void listOfContacts(Map <Integer,Contact> contact){
        for(Map.Entry<Integer,Contact> ent : contact.entrySet()){
            System.out.println(ent.getKey()+"->"+ent.getValue());
        }
    }

    public static void searchBynum(Map <Integer,Contact> contact,int num){
       System.out.println();
        for(Contact c : contact.values()){
            if(c.getNumber()==num){
                System.out.printf("Contact found with First name %s Last name %s and Number %d",c.getFname(),c.getLname(),c.getNumber());
            }
        }
    }

     public static void searchByname(Map <Integer,Contact> contact,String name){
        System.out.println();
        for(Contact c : contact.values()){
            if(c.getFname().equals(name)){
                System.out.printf("Contact found with First name %s Last name %s and Number %d ",c.getFname(),c.getLname(),c.getNumber());
            }
        }
    }

    public static void sort(Map <Integer,Contact> contact){
        System.out.println();
        List <Contact> list = new ArrayList<>(contact.values());
        
        
      // list.sort(Comparator.comparing(Contact::getLname).thenComparing(Contact::getFname));
       list.sort((s1,s2)->s1.getLname().toLowerCase().compareTo(s2.getLname().toLowerCase()));

       for (Contact c : list) {
       System.out.println(c);
}
    }

    
}


public class CleanPhoneBook {
    public static void main(String[] args) {
        
        Map <Integer,Contact> contact = new HashMap<>();

        while(true){

            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();

            switch(choice){

                case 1: System.out.println("Enter Key");
                        int id = sc.nextInt();
                        System.out.println("Enter First Name");
                        String fname = sc.next();
                        System.out.println("Enter Last Name");
                        String lname = sc.next();
                        System.out.println("Enter Phone Number");
                        int num = sc.nextInt();

                        Contact con = new Contact(fname,lname,num);
                        Contact.addContact(contact, id, con);
                        break;

                case 2: Contact.listOfContacts(contact); 
                        break; 
                        
                case 3: System.out.println("Enter the number to search");
                        int n = sc.nextInt();
                        Contact.searchBynum(contact, n);
                        break;   
                        
                case 4: System.out.println("Enter the name to search");
                        String first = sc.next();
                        Contact.searchByname(contact, first); 
                        
                case 5: System.out.println("Sorting by Last Name"); 
                        Contact.sort(contact);
                        break;       
           
           
            }           




        }
   
    }
}


 // Contact con1 = new Contact("Sahid", "Ahmed", 6901);
        // Contact con2 = new Contact("Amzad", "Zinat", 6201);
        // Contact con3 = new Contact("Kriti", "Dsouza", 6211);
        // Contact con4 = new Contact("Binit", "Shukla", 6301);



        // Contact.addContact(contact,1,con1);
        // Contact.addContact(contact,2,con2);
        // Contact.addContact(contact,3,con3);
        // Contact.addContact(contact,4,con4);


        // Contact.listOfContacts(contact);
        // Contact.searchBynum(contact, 6901);
        // Contact.searchByname(contact, "Sahid");

        // Contact.sort(contact);