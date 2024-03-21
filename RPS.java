import java.util.Scanner;
import java.util.Random;

public class RPS {
    public static void main(String[] args) {
        String userChoice;    //User's choice -- "R", "P", or "S"
        String computerChoice;  //Computer's choice -- "R", "P", or "S"
        int computerInt;      //Randomly generated number used to determine
                              //computer's choice

        Scanner scan = new Scanner(System.in);
        Random generator = new Random();

        //Get user's choice -- note that this is stored as a string
        //Make user's choice uppercase for ease of comparison
        System.out.print("Enter your choice (R, P, or S): ");
        userChoice = scan.next().toUpperCase();

        //Generate computer's choice (0,1,2)
        computerInt = generator.nextInt(3);

        //Translate computer's randomly generated choice to string
        switch (computerInt) {
            case 0:
                computerChoice = "R";
                break;
            case 1:
                computerChoice = "P";
                break;
            case 2:
                computerChoice = "S";
                break;
            default:
                computerChoice = "Error"; // This case should not occur, but handling it just in case
        }

        //Print computer's choice
        System.out.println("Computer's choice: " + computerChoice);

        //Determine the winner. Use nested if-else statements instead of &&.
        if (userChoice.equals(computerChoice))
            System.out.println("It's a tie!");
        else if (userChoice.equals("R"))
            if (computerChoice.equals("S"))
                System.out.println("Rock crushes scissors. You win!!");
            else
                System.out.println("Paper covers rock. You lose!!");
        else if (userChoice.equals("P"))
            if (computerChoice.equals("R"))
                System.out.println("Paper covers rock. You win!!");
            else
                System.out.println("Scissors cuts paper. You lose!!");
        else if (userChoice.equals("S"))
            if (computerChoice.equals("P"))
                System.out.println("Scissors cuts paper. You win!!");
            else
                System.out.println("Rock crushes scissors. You lose!!");
        else
            System.out.println("Invalid input. Please enter R, P, or S.");
    }
}