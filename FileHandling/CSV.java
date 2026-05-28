//package FileHandling;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;



class Employees {
    int id;
    String name;
    String dept;
    double salary;

    
    public Employees(int id, String name, String dept, double salary) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getDept() {
        return dept;
    }
    public double getSalary() {
        return salary;
    }
    @Override
    public String toString() {
        return "id: " + id +"| "+ "name: " + name + "| "+"dept: " + dept + "| "+ "salary: " + salary;
    }   
}



public class CSV {

   public static Employees parsing(String line) throws CustException{
     
        String[] values = line.split(",");

        if(values.length!=4){
            throw new CustException("Columns mismatch");
        }
        
        String ids = values[0].trim();
        String names = values[1].trim();
        String depts = values[2].trim();
        String salarys = values[3].trim();

         if (ids.isEmpty())
            throw new CustException("Missing ID: " + line);

        if (names.isEmpty())
            throw new CustException("Missing Name: " + line);

        if (depts.isEmpty())
            throw new CustException("Missing Department: " + line);

        if (salarys.isEmpty())
            throw new CustException("Missing Salary: " + line);

        int id;
        double salary;
        
        try {
        id = Integer.parseInt(ids);
        } catch(NumberFormatException ce){
           throw new CustException("Cannot convert str -> Int");
        }

        try {
        salary = Double.parseDouble(salarys);
        } catch(NumberFormatException ce){
           throw new CustException("Cannot convert str -> double");
        }

        if(salary < 0){
            throw new CustException("Salary cannot be negative ");
        }

        return new Employees(id,names,depts,salary);     
   }

   public static void reportGen(List<Employees> emp){
       System.out.println("Summary Report on the Employee File ");
       System.out.println("Total number of Employees in all the department: "+emp.size());
       double avg = emp.stream().mapToDouble(Employees::getSalary).average().orElse(0);
       System.out.println("Average Salary of Employees in all department : "+avg);

       System.out.println("Total number of departments");
       long count = emp.stream().map(Employees::getDept).distinct().count();
       System.out.println(count);

       emp.stream()
                .map(Employees::getDept)
                .distinct()
                .forEach(dept -> {
                    long countDept = emp.stream()
                            .filter(e -> e.getDept().equals(dept))
                            .count();

                    System.out.println(dept + ": " + countDept);
                });
    
                // Write to CSV 
                 Map<String, Long> deptMap = emp.stream()
            .collect(Collectors.groupingBy(
                    Employees::getDept,
                    Collectors.counting()
            ));

    deptMap.forEach((dept, countDept) ->
            System.out.println(dept + ": " + countDept)
    );


    String outputPath = "summary.csv";

    try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(outputPath))) {

        writer.write("Metric,Value");
        writer.newLine();

        writer.write("Total Employees," + emp.size());
        writer.newLine();

        writer.write("Average Salary," + avg);
        writer.newLine();

        writer.write("Total Departments," + count);
        writer.newLine();
        writer.newLine();

        writer.write("Department,Count");
        writer.newLine();

        for (Map.Entry<String, Long> entry : deptMap.entrySet()) {
            writer.write(entry.getKey() + "," + entry.getValue());
            writer.newLine();
        }

        System.out.println(" CSV file generated: " + outputPath);

    } catch (IOException e) {
        System.out.println("Error writing CSV: " + e.getMessage());
    }
}

   


   public static void main(String[] args) throws Exception {
    
    List <Employees> empList = new ArrayList<>(); 
   
    try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\sahid\\Downloads\\employees.csv"))) {
            String line;
            boolean header = true;

            while ((line = br.readLine()) != null) {
                
                if(header){             // to skip the header (id,name,dept,sal) since they aren't the data we need
                    header = false;
                    continue;
                }
                try {
                    Employees emp = parsing(line);
                    empList.add(emp);
                } catch (CustException e) {
                    System.out.println("Skipping bad row: " + e.getMessage());
                }
               
            }
              
        } catch (IOException e) {
            System.out.println("Error opening the file " + e.getMessage());
        }  

       System.out.println(empList);
        reportGen(empList);

}
}