class Employee1 {
    int id;                                                         // only one public class exists in java
    String name;
int salary;

    public void printdetails() {
        System.out.println("my id is " + id);
        System.out.println("my name is " + name);
    }

    public int getsalary() {
        return salary;
    }
}
public class CWH_38_custom_class {

    public static void main(String[] args) {
        System.out.println("Making custom class");
        Employee1 harry = new Employee1();           // initiating  a new employee
        Employee1 john = new Employee1();            // initiating  a new employee
        // setting attributes for john
        john.id = 17;
        john.name = "john khandelwal";
        john.salary = 12;
        // setting attributes for harry
        harry.id = 12;
        harry.name = "CodeWithHarry";
        harry.salary = 24;
        // printing the attributes
         harry.printdetails();
        john.printdetails();
//        System.out.println(harry.id);
//        System.out.println(harry.name);
        int salary =john.getsalary();
        System.out.println(salary);

    }
}
