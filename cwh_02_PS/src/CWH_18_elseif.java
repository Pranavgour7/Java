import java.util.Scanner;
public class CWH_18_elseif {
    public static void main(String[] args) {
        System.out.println("What is your age");
       /* Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        switch (age){
            case 18:
                System.out.println("You are an adult!");
                break;
            case 24:
                System.out.println("You are going to join job");              //Check what happens when you comment out {BREAK}
                break;
            case 29:
                System.out.println("You are going to get married");
                break;
            case 69:
                System.out.println("You are DEAD");
                break;
            default:
                System.out.println("Enjoy your life");
                break;
        }

        /*
        if (age>56){
            System.out.println("You are experienced!");
        }
else if(age>46){
            System.out.println("You are semi-experienced!");
        }
else if(age>36){
            System.out.println("You are semi-semi-experienced");
        }
else {
            System.out.println("You are not experienced");
        }

         */
        String var = "Sourabh";

        switch (var){
            case "Pranav" :
                System.out.println("You are an adult!");
                break;
            case "Sourabh":
                System.out.println("\nYou are going to join job");
                break;
            case "Shiv":
                System.out.println("You are going to get married");
                break;
            case "Yogi":
                System.out.println("You are DEAD");
                break;
            default:
                System.out.println("Enjoy your life");
                break;
        }
        //Switch statement can be replaced by enhanced switch {just alt+shift+enter}
        Scanner sc = new Scanner(System.in);
        int age2 = sc.nextInt();


        switch (age2) {
            case 18 -> System.out.println("You are an adult!");
            case 24 ->
                    System.out.println("You are going to join job");             //In this no need of break
            case 29 -> System.out.println("You are going to get married");
            case 69 -> System.out.println("You are DEAD");
            default -> System.out.println("Enjoy your life");
        }
    }
}
