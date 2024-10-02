import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        // Declare variables
        Scanner in = new Scanner(System.in);
        double gasCapacity = 0;
        double gasEfficiency = 0;
        double gasPrice = 0;
        double maxDistance = 0;
        double pricePerHundredMiles = 0;
        boolean done = false;
        String trash = "";

        // Get user input
        do
        {
            System.out.println("Please enter the fuel capacity of your vehicle in gallons.");
            if(in.hasNextDouble())
            {
                gasCapacity = in.nextDouble();
                trash = in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input " + trash + ". You must enter a valid fuel capacity.");
            }
        }while(done == false);
        done = false;
        do
        {
            System.out.println("Please enter the fuel efficiency of your vehicle in gallons/mile.");
            if(in.hasNextDouble())
            {
                gasEfficiency = in.nextDouble();
                trash = in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input " + trash + ". You must enter a valid fuel efficiency.");
            }
        }while(done == false);
        done = false;
        do
        {
            System.out.println("Please enter the gas price.");
            if(in.hasNextDouble())
            {
                gasPrice = in.nextDouble();
                trash = in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input " + trash + ". You must enter a valid gas price.");
            }
        }while(done == false);

        // Do calculations
        pricePerHundredMiles = (100/ gasEfficiency)*gasPrice;
        maxDistance = gasCapacity* gasEfficiency;

        //Output
        System.out.println("The cost to drive 100 miles is $" + pricePerHundredMiles);
        System.out.println("Your vehicle can drive " + maxDistance + " miles on a full tank of gas.");
    }
}