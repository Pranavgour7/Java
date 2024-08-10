import java.util.Random;
import java.util.Scanner;

class Game{
    public int number;
    public int inputNumber;
    public int noOfGuesses=0;
    public int getNoOfGuesses () {
        return noOfGuesses;
    }

    public void setNoOfGuesses ( int noOfGuesses){
        this.noOfGuesses = noOfGuesses;
    }
   Game() {
       Random rand = new Random();
       this.number = rand.nextInt(100);
   }

    void takeUserInput() {
        System.out.println("Enter your Guess");
        Scanner sc=new Scanner(System.in);
        this.inputNumber = sc.nextInt();
    }
    boolean isCorrectNumber() {
       noOfGuesses++;
        if (number == inputNumber) {
            System.out.format("You have Guessed it right it is %d\n IN %d attempts", number, noOfGuesses);
            return true;
        } else if (number > inputNumber) {
            System.out.println("increase your no.");
        } else if (number < inputNumber) {
            System.out.println("decrease your no.");
        }
        return false;
    }
    }
    public class CWH_50_ex3sol {



        public static void main(String[] args) {
         /*
        Crate a class Game , which allow a user to play "Guess the number"
        Game once. Game should have the following methods:
        1. Constructor to generate the random number.
        2.takeUserInput() take a user input of user
        3. isCorrectNumber() to detect whether the number entered by the
        user is correct
        4.getters and setters for no. of guesses
        Use properties such as noOfGuesses(int), etc to get this task done
         */
        Game g = new Game();
        boolean b = false;
        while (!b) {
            g.takeUserInput();
            b = g.isCorrectNumber();
        }
    }
}

