import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {
        //Declare variables
        Scanner in = new Scanner(System.in);
        boolean done = false;
        double temperature = 0;
        String trash = "";

        // Get user input
        do
        {
            System.out.println("Please enter a temperature in Celsius.");
            if(in.hasNextDouble())
            {
                temperature = in.nextDouble();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input " + trash + ". You must enter a valid temperature.");
            }
        }while(done == false);

        // Do calculations
        temperature = temperature * ((double) 9/5) + 32;

        // Output
        System.out.println("The temperature in Fahrenheit is " + temperature);
    }
}