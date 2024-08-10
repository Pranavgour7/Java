public class CWH_33_varargs {
//    static int sum(int a,int b){
//        return a+b;
//    } static int sum(int a,int b,int c){
//        return a+b+c;
//    } static int sum(int a,int b,int c, int d){
//        return a+b +c+d;
//    }

    // VARARGS
 public    static int sum (int ...arr){
        int result = 0;
        for (int a:arr){
            result += a;
        }
        return result;
    }
    public static int sum2 (int x,int ...arr){
        int result = x;
        for (int a:arr){
            result += a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("The sum of 4 and 5 is " + sum(4,5));
        System.out.println("The sum of Nothing is " + sum());
        System.out.println("The sum of 1 is" + sum(1));
        System.out.println("The sum of 4,3 and 5 is " + sum(4,5,3));
        System.out.println("The sum of 4,2,3 and 5 is " + sum(4,5,3,2));
        System.out.println("The sum of 4,2,3,3,7,6 and 5 is " + sum(4,5,3,2,1,7,6));


//        System.out.println("The sum of Nothing is " + sum2());             It gives an error
        System.out.println("The sum of 1 is " + sum2(1));
        // to avoid using methods again and again we use VARARGS
    }
}