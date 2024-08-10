class Base1 {
    Base1(){
        System.out.println("I am a contructor!");
    }
    Base1(int x){
        System.out.println("I am an overload contructor with value of x as: " + x);
    }
}
    class Derived1 extends Base1 {
        Derived1() {
            // to print overload operator of base1
            super(0);
            System.out.println("I am a Derived class constructor");
        }

        Derived1(int x, int y) {
            super(x);
            System.out.println("I am an overload constructor with value of y as: " + y);
        }
    }
class childofderived extends Derived1{
        childofderived(){
            System.out.println("I am a child of Derived1");
        }
    childofderived(int x,int y,int z){
super(x, y);
        System.out.println("I am an overload constructor of child of Derived with value of z: "+z);
    }
    }

public class cwh_46_contructorsininheritence {
    public static void main(String[] args) {
//Base1 a = new Base1();
//Derived1 b = new Derived1(14,7);              // First the base1 constructor will be expressed
    childofderived c = new childofderived(14,15,7);
    }
}
