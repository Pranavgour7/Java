import java.util.Scanner;

import static java.lang.Float.isNaN;

public class Main {
    public static void main(String[] args) {
      // Question 1
      //  int a = 43;
       // int b = 2;
     //   int c = 3;
       // int sum = a + b + c;
        //System.out.println(sum);
        // Question 2
       // float num1 = 23;
       // float num2 = 43;
      //  float num3 = 53;
     //   float cgpa = (num1 + num2 + num3)/30;
     //   System.out.println(cgpa);

     //Question 3
      //  System.out.println("what is your name!");
    // Scanner sc = new Scanner(System.in);
    // String name = sc.next();
    //    System.out.println("Hello " + name + " have a good day.");

       //  Question 4 convert km into miles
      //  Scanner sc = new Scanner(System.in);
        //System.out.println("Write the value in km");
       //float km = sc.nextFloat();
        //float miles = (float) (0.62137*km);
       //System.out.println(miles);

        // Question 5 detect an integer

     // Scanner sc = new Scanner(System.in);
      //  System.out.println("Enter your number");
       // System.out.println(sc.hasNextInt());

           //Question 6 percentage of five subjects
        System.out.println("Taking input from the user");
        Scanner in = new Scanner(System.in);
        float Sub1 = in.nextFloat();
        float Sub2 = in.nextFloat();
        float Sub3 = in.nextFloat();
        float Sub4 = in.nextFloat();
        float Sub5 = in.nextFloat();
        System.out.println("The percentage is");
        float Percentage = (Sub1+Sub2+Sub3+Sub4+Sub5)/5;
        System.out.println(Percentage);






    }
}