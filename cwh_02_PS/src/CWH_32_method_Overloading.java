public class CWH_32_method_Overloading {
    static void foo(){
        System.out.println("Good morning bro!");
    }

    static void foo(int a){
        System.out.println("Good morning "+ a + " bro!");
    }
    static void foo(int a,int b){
        System.out.println("Good morning "+ a + " bro!");
        System.out.println("Good morning "+ b + " bro!");
    }
    static void change(int a){
         a = 45;
    }

    static void change2(int [] arr){
         arr[0] = 95;
    }
    static void telljokes(){
        System.out.println("I have invented a new word! \n Plagiarism!");
    }

    public static void main(String[] args) {
        telljokes();

//    Case 1 -> changing the Integer
//        int x = 98;
//        change(x);
//        System.out.println("THe value of array after running the method: " + x);
//         It does't change the value of x !!! Case 1 -> changing the Integer


int [] marks = {52,31,47,95,25};
        change2(marks);
        System.out.println("THe value of array after running the method: " + marks[0]);
//         It changes the value of marks [0]  !!!

        // Method overloading
       foo();
       foo(3000);
       foo(3000,2999);
        // Arguments are actual like 3000 and 2999
        // a and b are parameters
    }
}
