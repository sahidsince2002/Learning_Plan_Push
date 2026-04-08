import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Employee {
    int id;
    String name;
    String dept;
    double salary;
    public Employee(int id, String name, String dept, double salary) {
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
    return String.format(
        "Employee {\n" +
        "  ID      : %d\n" +
        "  Name    : %s\n" +
        "  Dept    : %s\n" +
        "  Salary  : %.2f\n" +
        "}",
        id, name, dept, salary
    );
}
    
    
}

class DeptStats {
    double avgSal;
    List<Employee> three;
    public DeptStats(double avgSal, List<Employee> three) {
        this.avgSal = avgSal;
        this.three = three;
    }
    public double getAvgSal() {
        return avgSal;
    }
    public List<Employee> getThree() {
        return three;
    }
    @Override
public String toString() {
    String employees = three.stream()
        .map(Employee::toString)
        .collect(Collectors.joining("\n\n"));

    return String.format(
        "\nDeptStats {\n" +
        "  Average Salary : %.2f\n" +
        "  Top Employees  : [\n%s\n  ]\n" +
        "}",
        avgSal, employees
    );
}

    
}

public class EmployeeStream {
    public static void main(String[] args) {
        
    
    List <Employee> list = new ArrayList<>();

    list.add(new Employee(101,"Sahid","IT",2100.13));
    list.add(new Employee(102,"Sunil","sales",2300.23));
    list.add(new Employee(103,"Rekha","Team Lead",2500.03));
    list.add(new Employee(104,"Binit","HR",4320.43));
    list.add(new Employee(105,"Gaurav","sales",3200.13));
    list.add(new Employee(106,"Dish","IT",2700.93));


   // System.out.println(list);

    List <String> dept = list.stream().map(Employee::getDept).collect(Collectors.toList());
    System.out.println(dept);

    List <String> dept2 = list.stream().map(Employee::getName).collect(Collectors.toList());
    System.out.println(dept2);

    List <String> dept3 = list.stream().filter(e->e.getDept().equals("IT")||e.getDept().equals("sales")).map(Employee::getName).collect(Collectors.toList()); //filter employee based on dept
    System.out.println(dept3);

    
    double avgSal = list.stream().mapToDouble(Employee::getSalary).average().orElse(0);
    System.out.println(avgSal);

    List <Double> dept4 = list.stream().map(Employee::getSalary).sorted((a,b)->Double.compare(b,a)).limit(2).collect(Collectors.toList());
    System.out.println(dept4);

    Map<String,Double> groupedBydept = list.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors.averagingDouble(Employee::getSalary)));
    System.out.println(groupedBydept);


    for(Map.Entry<String,Double> ent : groupedBydept.entrySet()){
        System.out.println(ent.getKey()+"->"+ent.getValue());
    }

    // for (Map.Entry<String, Double> entry : groupedBydept.entrySet()) {
    // System.out.println("Department: " + entry.getKey());

    // for (Employee e : entry.getValue()) {
    //     System.out.println("  " + e.getName() + " - " + e.getSalary());
    // }


// 1. Change return type to Map<String, DeptStats>
Map<String, DeptStats> result = list.stream()
    .collect(Collectors.groupingBy(
        Employee::getDept, 
        Collectors.collectingAndThen(
            Collectors.toList(), 
            deptList -> {
                // Calculate average salary
                double avg = deptList.stream()
                    .mapToDouble(Employee::getSalary)
                    .average()
                    .orElse(0);

                // Find top 3 employees by salary
                List<Employee> top3 = deptList.stream()
                    .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                    .limit(3)
                    .collect(Collectors.toList());

                return new DeptStats(avg, top3);
            }
        )
    ));

    for (Map.Entry<String, DeptStats> entry : result.entrySet()) {
       System.out.println(entry.getKey()+" ->"+entry.getValue());
    }


    // Map<String, List<String>> namesByDept = list.stream()
    // .collect(Collectors.groupingBy(
    //     Employee::getDept, 
    //     Collectors.mapping(Employee::getName, Collectors.toList())
    // ));

   // System.out.println(namesByDept);
    
}

    }

