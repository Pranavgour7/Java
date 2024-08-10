class MymainEmployee{
    private int id;
    private String name;
    private int Salary;
    public MymainEmployee(){
        Salary=10000;
    }
    public MymainEmployee(int mysalary){
        Salary=mysalary;
    }
//    public MymainEmployee(){
//        id = 45;
//        name = "Pranav gour";
//    }
    public MymainEmployee(String myname,int myid){
        id = myid;
        name = myname;
    }
    public MymainEmployee(String myname){
        id = 5;
        name = myname;
    }
    public void setSalary(int s){
        Salary = s;
    }
    public int getSalary(){
        return Salary;
    }

    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
    public void setId(int i){
        id = i;
    }
    public int getId(){
        return id;
    }

}
public class CWH_42_constructors {
    public static void main(String[] args) {
// MymainEmployee harry= new MymainEmployee("Pranav Gour",69);
 MymainEmployee harry= new MymainEmployee();
// MymainEmployee harry= new MymainEmployee("Chinu gour");

 //harry.setName("Code with Pranav");
 //harry.setId(234);
//        System.out.println(harry.getName());
//        System.out.println(harry.getId());
        System.out.println(harry.getSalary());
    }
}
