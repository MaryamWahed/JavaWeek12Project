package constructors;

import java.util.ArrayList;

public class Microsoft {

    public static void main(String[] args) {

        Employee employee1 = new Employee();// calling for default constructor

        employee1.salary = 120000;
        System.out.println(employee1.toString());

        employee1.name = "Ersin";
        employee1.ID = 100;
        employee1.jobTitle = "Technical Manager";

        Employee employee2 = new Employee("Efe", "QA Lead", 200, 110000);

        ArrayList<Employee> team = new ArrayList<>();

        team.add(employee1);
        team.add(employee2);

        team.add(new Employee("Jamal", "SDET", 300, 95000));

        // let's find Max salary from team list

        double maxSalary = Double.MIN_VALUE;
        for (Employee each : team){// each is am Employee object

            if (each.salary>maxSalary){
                maxSalary = each.salary;
            }
        }

        System.out.println("maxSalary = " +maxSalary);

        // I want to find out Jamal's job title
        for (Employee each: team){
            if (each.name.equalsIgnoreCase("jamal"))
                System.out.println(each.jobTitle);
        }

/*
Note: You can change or call static field through object or ClassName
but second one maybe preferable
 */

       // employee1.companyName = "Tesla";
        Employee.companyName = "Tesla";
       // company name for each employee
        for (Employee each: team){
            System.out.println(each.name+" is working for " +each.companyName);
        }



    }





}
