import java.util.Random;
import java.util.Scanner;
public class CWH_41_ex2_sol {
    public static void main(String[] args) {
//0 for rock
        //1 for paper
        // 2 for scissor
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your choice 0->Rock 1->Paper 2->Scissor");
        int userinput=sc.nextInt();

        Random random=new Random();
        int computerinput= random.nextInt(3);

        if (userinput==computerinput) {
            System.out.println("Draw");
        } else if (userinput == 0&&computerinput == 2 || userinput == 1&&computerinput == 0 || userinput == 2&&computerinput == 1) {
           // System.out.println("Computer choice: "+computerinput);
            System.out.println("User Win");
        }
        else {
           // System.out.println("Computer choice: "+computerinput);
            System.out.println("Computer Wins");
        }
        if (computerinput == 0){
            System.out.println("Computer choice : Rock");
        }
        else if (computerinput == 1){
            System.out.println("Computer choice : Paper");
        }
        else {
            System.out.println("Computer choice : Scissor");
        }
    }
    }

