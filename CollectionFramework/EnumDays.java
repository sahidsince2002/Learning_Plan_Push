enum Days {

    Monday(true), 
    Tuesday(true), 
    Wednesday(true), 
    Thursday(true), 
    Friday(true), 
    Saturady(false), 
    Sunday(false);

    private final boolean isWeekday;

    Days(boolean isWeekday) {
        this.isWeekday = isWeekday;
    } 
 
    public String isWeekdayOrNot(){
        if(isWeekday){
            return " is a weekday";
        }
        else {
            return " is a Weekend";
        }
    }
    
}

public class EnumDays {
    public static void main(String[] args) {
        Days d = Days.Friday;
        
       
    
       
        
        System.out.println("\nPrinting Days using direct access ");
        //System.out.println(d+" "+" "+d1+" "+d2);
        
        System.out.println("\nPrinting Days using For Loop ");
        for (int i = 0; i < Days.values().length; i++) {
            System.out.println(Days.values()[i]);
        }
        System.out.println("\nPrinting Days with the types ");
        for (Days values : Days.values()) {
            System.out.println(values+values.isWeekdayOrNot());
        }
        
    }
}