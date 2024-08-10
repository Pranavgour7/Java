class Base{
    int x;

    public int getX() {
        System.out.println("I am in base and setting x now");
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void printMe(){
        System.out.println("I am constructor");
    }
}
class Derived extends Base {
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
    // Quiz
    class Animal{
        int age ;

        public int getAge() {
            System.out.println("My age is:");
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void printMe() {
            System.out.println(" I am an animal.");
        }
    }
    class Dog extends Animal{
    String habit;

        public String getHabit() {
            return habit;
        }

        public void setHabit(String habit) {
            this.habit = habit;
        }
    }

public class cwh_45_inheritence {
    public static void main(String[] args) {

Base b = new Base();
// creating an object of base class
 b.setX(4);
        System.out.println(b.getX());
        // creating an  object of derived class
Derived d = new Derived();                       // both base and derived class can be used for this code
d.setX(4);
        System.out.println(d.getX());

        // Quiz
        // Creating an object of Animal class
        Animal a = new Animal();
        a.setAge(7);
        System.out.println(a.getAge());
        // creating an object of Dog class
        Dog o = new Dog();
        o.setHabit("Barkk...");
        System.out.println(o.getHabit());
        o.setAge(9);
        System.out.println(o.getAge());
    }
}
