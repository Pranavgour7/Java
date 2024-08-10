// Problem 1
class Employee{
int salary;
String name;

public int getSalary(){
    return salary;
}

    public String getName() {
        return name;
    }

    public void setName(String n){
    name = n;
    }
}
// problem 2

class Cellphone{
    public void vibrate(){
        System.out.println("Vibrating...");
    }
    public void ring(){
        System.out.println("Ringing...");
    }
    public void Callfriend(){
        System.out.println("CallingShiv...");
    }
}
// problem 3

class square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}

// problem 4
class rectangle{
    int l;
    int b;
    public int area(){
        return l*b;
    }
    public int perimeter(){
        return 2*(l+b);
    }
}

// problem 5
class Tommy{
    public void hit(){
        System.out.println("Hitting the enemy");
    }
    public void fire(){
        System.out.println("firing on the enemy");
    }
    public void run(){
        System.out.println("Running from the enemy");
    }
}

// problem 6
class circle {
    float r;

    public float area() {
        return 3.14f * r * r;
    }
    public float perimeter(){
        return 2*3.14f*r;
    }
}
public class CWH_39_ps08 {
    public static void main(String[] args) {
/*// problem 1
        Employee harry = new Employee();
//harry.setName("Pranav gour");
        System.out.println(harry.getName());
        harry.salary = 233;
        System.out.println(harry.getSalary());

        // problem 2
        Cellphone asus = new Cellphone();
        asus.vibrate();
        asus.ring();
        asus.Callfriend();

        // Problem 3
        square sq = new square();
        sq.side = 4;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());

        // problem 4
        rectangle rt = new rectangle();
        rt.l = 4;
        rt.b = 2;
        System.out.println(rt.area());
        System.out.println(rt.perimeter());*/

        // Problem 5
        Tommy player1 = new Tommy();
        player1.hit();
        player1.run();
        player1.fire();

        // Problem 6
circle radius = new circle();
radius.r = 3;
        System.out.println(radius.area());
        System.out.println(radius.perimeter());
    }
}
