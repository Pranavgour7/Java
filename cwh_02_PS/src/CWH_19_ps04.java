import java.util.Scanner;
public class CWH_19_ps04 {
    public static void main(String[] args) {

        //Question 1

        int a = 10;                          //Understand the difference between = and ==
        if (a == 11) {
            System.out.println("Y");
        }
        // Question 2

//        byte m1, m2, m3;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your marks in Physics");
//        m1 = sc.nextByte();
//
//        System.out.println("Enter your marks in Chemistry");
//        m2= sc.nextByte();
//
//        System.out.println("Enter your marks in Mathematics");
//        m3 = sc.nextByte();
//        float avg = (m1+m2+m3)/3.0f;
//        System.out.println("Your Overall percentage is: " + avg);
//        if(avg>=40 && m1>=33 && m2>=33 && m3>=33){
//            System.out.println("Congratulations, You have been promoted");
//        }
//        else{
//            System.out.println("Sorry, You have not been promoted! Please try again.");
//        }

        //Question 3
        /*
        float tax = 0;
        System.out.println("What is your income!");
        Scanner sc = new Scanner(System.in);
        float income = sc.nextFloat();
        if (income <= 2.5f) {
            tax = tax + 0;
        }
        else if(income>2.5f && income<=5.0f){
            tax = tax + 0.05f*(income-2.5f);
        }
        else if(income>5.0f && income<10.0f){
            tax = tax + 0.05f*(5.0f-2.5f);
            tax =tax + 0.2f*(income-5.0f);
        }
        else if(income>10.0f && income<=15.0f){
            tax = tax + 0.05f*(5.0f-2.5f);
            tax =tax + 0.2f*(10.0f-5.0f);
            tax = tax + 0.3f*(income - 10.0f);
        }
        System.out.println("The amount of tax the man should pay is " + tax);

        //Question 4

        System.out.println("Write the day number");
        Scanner sp = new Scanner(System.in);
        int num = sp.nextInt();
        switch (num){
            case 1-> System.out.println("Monday");
            case 2-> System.out.println("Tuesday");
            case 3-> System.out.println("Wednesday");
            case 4-> System.out.println("Thrusday");
            case 5-> System.out.println("Friday");
            case 6-> System.out.println("Saturday");
            case 7-> System.out.println("Sunday");
        }
*/
        // Question 6
//        Scanner se = new Scanner(System.in);
//        String website = se.next();
//        if (website.endsWith(".org")) {
//            System.out.println("organisational website");
//        } else if (website.endsWith(".com")) {
//            System.out.println("commercial website");
//        } else if (website.endsWith(".in")) {
//            System.out.println("Indian website");
//        }

        //Question 5
        System.out.println("Write a year and I will tell you it's a leap year or not");
        Scanner sc = new Scanner(System.in);
    int Year = sc.nextInt();
    if (Year%4==0){
        System.out.println("It's a Leap year");
    }
    else if (Year%4!=0){
        System.out.println("It's not a Leap year");
    }
    }
        }
