import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

record Student(int id,String name,String subject,float marks){

}

public class HTMLreport {

    public static Student parsingLogic(String line) throws ReportException{
        String[] val = line.split(",");

        if(val.length!=4){
            throw new ReportException("Unmatched column");
        }

        String ids = val[0].trim();
        String names = val[1].trim();
        String subjects = val[2].trim();
        String marks = val[3].trim();

         if (ids.isEmpty())
            throw new ReportException("Missing ID: " + line);

        if (names.isEmpty())
            throw new ReportException("Missing Name: " + line);

        if (subjects.isEmpty())
            throw new ReportException("Missing Subject: " + line);

        if (marks.isEmpty())
            throw new ReportException("Missing Marks: " + line);

        int id;
        float mark;

        try {
            id = Integer.parseInt(ids);
        }catch(NumberFormatException e){
            throw new ReportException("Cannot convert id to integer");
        }

         try {
            mark = Float.parseFloat(marks);
        }catch(NumberFormatException e){
            throw new ReportException("Cannot convert marks to float");
        }
    if(mark < 0){
        throw new ReportException("Marks cannot be negative ");
    }

    return new Student(id,names,subjects,mark);

        
    }




    public static void main(String[] args) throws FileNotFoundException, IOException {
      List <Student> stud = new ArrayList<>();

      try (BufferedReader bf = new BufferedReader(new FileReader("C:/Users/sahid/Downloads/students.csv")))
{
      String line;
      boolean header=true;

     while((line=bf.readLine())!=null){

       if(header){
        header=false;
        continue;
       }

       try {
        Student st = parsingLogic(line);
        stud.add(st);
       }catch(ReportException e){
        System.out.println("Skipping Bad row ");
       }

     }
}catch(IOException e){
    System.out.println("Cannot open the file ");
}

System.out.println(stud);
      
    }
}