package constructors;

public class Employee {

    public String name, jobTitle;
    public int ID;
    public double salary;              // instance variable, belongs to Object
    public static String companyName;  // static field belongs to Class

    static {
        companyName = "Microsoft";// this value is same for all objects of this claas
    }
    public Employee(){
        salary = 10000;// whe I create an Employee object with default constructor, their salary will be 10000 as default.
    }



    public Employee(String name, String jobTitle, int ID, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.ID = ID;
        this.salary = salary;
    }


    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", ID=" + ID +
                ", salary=" + salary +
                ", company name=" + companyName +
                '}';
    }
}
