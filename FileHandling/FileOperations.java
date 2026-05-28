package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileOperations {
    public static void main(String[] args) throws IOException {
        // creating a new file
        File obj = new File("newfile.txt");            
        obj.createNewFile();      
        
        //writing into a file 
        FileWriter fw = new FileWriter("newfile.txt");  
        fw.write("Hello I am alive ");
        fw.close();

        //reading file 
        Scanner reader = new Scanner(obj);

        while(reader.hasNextLine()){
            System.out.println(reader.nextLine());
        }
        reader.close();
        
        //check if file is readable 
        if(obj.canRead()){
            System.out.println("File is readable ");
        }
        else {
            System.out.println("File isn't readable");
        }

         // check file is writable 
         if (obj.canWrite()) {
                System.out.println("The file is writable."); 
            } else {
                System.out.println("The file is not writable.");
            }

         // Check if the file exists
        if (obj.exists()) {
            System.out.println("The file exists.");  // One-line explanation
        } else {
            System.out.println("The file does not exist.");
        }

        // Print the absolute path of the file
        System.out.println("Absolute Path: " + obj.getAbsolutePath());

         // Deleting File
        if (obj.delete()) {
            System.out.println("The deleted file is : " + obj.getName());
        }
    }
}