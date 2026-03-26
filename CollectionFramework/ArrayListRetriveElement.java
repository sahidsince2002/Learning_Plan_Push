import java.util.ArrayList;

public class ArrayListRetriveElement {
    
    public static void main(String[] args) {
        
        ArrayList <String> list = new ArrayList<>();

        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Violet");
        System.out.println("Colours : "+list);
        list.set(3, "Orange");
         System.out.println("Colours updated : "+list);
         list.remove(2);
        System.out.println("Colours : "+list);
        
        list.add(0,"maroon");
        list.addFirst("pink");
        list.add(2,"Magenta");
        


        System.out.println("Colours: "+list);
        System.out.println("Colour at index 0 : "+list.get(0));
        System.out.println("Colours at index 2 : "+list.get(2));
        

      boolean flag=false;

       // Search for an element in list
        for(int i=0;i<list.size();i++){
            if(list.get(i)=="Indigo"){
                flag =true;
                System.out.println("Element found in index "+i);
            }
            //System.out.println(list.get(i));
        }
        if(flag==false){
        System.out.println("Not Found");
        }

        if(list.contains("Magenta")){
            System.out.println("Yes tere");
        }

    }
}

