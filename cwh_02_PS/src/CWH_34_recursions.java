public class CWH_34_recursions {
    // factorial 0 = 1
    // factorial n = n* n-1 * n-2.......1
    // factorial 3 = 3* 2* 1
//        factorial n = n* factorial(n-1)
    static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        else {
            return n * factorial(n-1);
        }
    }
    static int factorial_alternative(int n){
        if(n==0 || n==1){
            return 1;
        }
        else {
            int product = 1;
           for (int i = 1;i<=n;i++) {   //1 to n
               product *= i;
           }
               return product;
        }
    }

    public static void main(String[] args) {
        int x = 0;
        System.out.println("the value of the factorial is " + factorial(x));
        System.out.println("the value of the factorial is " + factorial_alternative(x));

//        exercise Question
        // print fibbonacci series

    }
}
