import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {
        // Declare variables
        Scanner in = new Scanner(System.in);
        double length = 0;
        double width = 0;
        double perimeter = 0;
        double diagonal = 0;
        double area = 0;
        boolean done = false;
        String trash = "";

        // Get user input
        do
        {
            System.out.println("Please enter the length of the rectangle.");
            if(in.hasNextDouble())
            {
                length = in.nextDouble();
                trash = in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input " + trash + ". You must enter a valid length.");
            }
        }while(done == false);
        done = false;
        do
        {
            System.out.println("Please enter the width of the rectangle.");
            if(in.hasNextDouble())
            {
                width = in.nextDouble();
                trash = in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input " + trash + ". You must enter a valid width.");
            }
        }while(done == false);

        // Do calculations
        area = length * width;
        perimeter = (2 * length) + (2 * width);
        diagonal = Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2));

        //Output
        System.out.println("The area of the rectangle is " + area);
        System.out.println("The perimeter of the rectangle is " + perimeter);
        System.out.println("The diagonal length for this rectangle is " + diagonal);
    }
}