public class CWH_35_ps07 {
    //Problem 1
//    static void multiplication(int n){
//       for(int i = 1;i<=10;i++){
//           System.out.format("%d X %d = %d \n ", n,i,n*i);
//       }
//    }

    // Problem 2
    static void Pattern1(int n){
        for (int i = 1;i<=n;i++){
            for (int j = 0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Problem 3
    static int sumRec(int a){
        if (a==1){
            return 1;
        }
        else {
            return a + sumRec(a-1);
        }
    }

    // problem 4
    static void pattern2(int n){
        for (int i = 0;i<4;i++){
            for(int j = 4;j>i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Problem 5
    static int fib(int n){
       /* if(n==1){
            return 0;
        }
        else if(n==2){
            return 1 ;
        }*/
        if(n==1 || n==2){
            return n-1;
        }
        else{
            return fib(n-1) + fib(n-2);
        }
    }

    // Problem 6
    static int avg(int ...arr){
        int result = 0;
        int n = arr.length;
        for (int a:arr ){
            result = (a + result);
        }
        return result/n;
    }

    // Problem 8
    static void pattern1_rec(int n){
        if (n>0) {
            pattern1_rec(n-1);
            for (int i = 0;i<n;i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
//    pattern1_rec(3)
//    pattern1_rec(2) + 3 times star and a new line
//    pattern1_rec(1) + 2 times star and a new line + 3 times star and a new line

    // Problem 7
    static void pattern2_rec(int n){
        if(n>0){
            pattern2_rec(n-1);
            for (int i = 4;i>=n;i--){                            // in this the pattern you have to print just write the for loop for reverse order pattern because in this printing starts from last
                System.out.print("*");
            }
            System.out.println();
        }
    }
    // Problem 9;
    static float temperature(float cel){
        float result = (cel * (9/5.0f)) + 32.0f;
return result;
    }

    // Problem 10
    static int sum1(int n){
        int sum = 0;
        for (int i = 1;i<=n;i++){
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
//        Problem 1
//      multiplication(7);

//        Problem 2
//        Pattern1(4);

        // Problem 3 (IMPORTANT)
//int a =sumRec(3);
//        System.out.println(a);

        // Problem 4
//        pattern2(4);

        // Problem 5
        // fibonacci series = 0,1,1,2,3,5,8.....
//       int result = fib(4);
//        System.out.print(result);

        //Problem 6
       // System.out.println("The avg of 2,4,3,1 and 5 is " + avg(2,4,3,1,5));

        // Problrm 8
//        pattern1_rec(4);

        // Problem 7
//        pattern2_rec(4);

        // Problem 9
//float celsius  = 9.45f;
//        System.out.println(temperature(celsius));

        //Problem 10
int a = 3;
        System.out.println(sum1(a));

    }
}
