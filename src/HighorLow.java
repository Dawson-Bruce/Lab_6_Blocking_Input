import java.util.Random;
import java.util.Scanner;

public class HighorLow {
    public static void main(String[] args) {
        // Declare variables
        Scanner in = new Scanner(System.in);
        Random generator = new Random();
        int randomValue = generator.nextInt(10) + 1;
        int userGuess = 0;
        boolean done = false;
        String trash = "";

        // Get user input
        do
        {
            userGuess = 0;
            System.out.println("Please enter your guess. [1-10]");
            if(in.hasNextInt())
            {
                userGuess = in.nextInt();
                if(userGuess >= 1 && userGuess <= 10)
                {
                    done = true;
                } else {
                    System.out.println("Input " + userGuess + " is outside the range [1-10]. Please enter a valid integer.");
                }
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input " + trash + ". Please enter a valid integer.");
            }
        }while(done==false);
        if(userGuess == randomValue)
        {
            System.out.println("Congratulations! You guessed the number (" + userGuess + ")!");
        } else if (userGuess < randomValue) {
            System.out.println("Your guess " + userGuess + " was low.");
        } else {
            System.out.println("Your guess " + userGuess + " was high.");
        }
    }
}
