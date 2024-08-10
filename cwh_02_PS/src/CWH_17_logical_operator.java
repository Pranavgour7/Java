public class CWH_17_logical_operator {
    public static void main(String[] args) {
        System.out.println("Logical operator AND...");
        boolean a = true;
        boolean b = false;                           // Associativity is left to right
        boolean c = true;
        if (a && b && c ){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
        System.out.println("Logical operator OR....");
        if (a||b){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
        System.out.println("For logical NOT");
        System.out.println("Not(a) is");
        System.out.println(!a);
    }
}
