package topic2;

import java.util.Scanner;

public class ElectricBill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask for account type and save it as a string
        String type = "";
        int asset = 0;

        while (true) {
            System.out.println("Enter the type of costumer (Personal/Professional): ");
            type = input.nextLine().toLowerCase();

            if (type.equals("personal")) {
                asset = 5;
                break;
            } else if (type.equals("professional")) {
                asset = 12;
                break;
            } else {
                System.out.println("Error: Invalid account type. Please try again.");
            }
        }

        // Ask for kWh usage and save it as a double
        double kWh = 0;

        while (true) {
            System.out.println("Enter the kWh usage (must be greater than 0): ");
            if (input.hasNextDouble()) {
                kWh = input.nextDouble();
                if (kWh > 0) {
                    break;
                } else {
                    System.out.println("Error: kWh must be greater than 0. Please try again.");
                }
            } else {
                System.out.println("Error: Invalid input. Please enter a number.");
                input.next(); // Clear the invalid input
            }
        }

        // Create a scale variable
        char scale = 0;
        double kWhCost = 0;

        // Create an if statement to calculate the kWh cost per scale
        if (kWh > 0 && kWh <= 250) {
            scale = 'A';
            kWhCost = kWh * 0.1;
        } else if (kWh > 250 && kWh <= 500) {
            scale = 'B';
            kWhCost = kWh * 0.12;
        } else if (kWh > 500) {
            scale = 'C';
            kWhCost = kWh * 0.15;
        }

        // Make the final operation to calculate the cost
        double total = asset + kWhCost;

        // Display the scale type, fixed asset cost and total summary
        System.out.printf("The scale is type: %c%n" +
                "The fixed asset is: $%d%n" +
                "The total cost is: $%.2f%n", scale, asset, total);
    }
}