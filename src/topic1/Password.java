package topic1;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {

        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Start counters for correct and incorrect passwords
        int correctCount = 0;
        int notCorrectCount = 0;

        System.out.printf("(Enter END to quit)%n");

        // Initial password input
        System.out.println("Enter your password: ");
        System.out.println("NOTE: ");
        System.out.println("(Must contain at least 8 characters, one lowercase letter, one uppercase letter, one number and one special character (!@#$%))");
        String password = input.nextLine();

        // Continue program until the user enters "END"
        while (!password.equals("END")) {
            boolean isValid = true;
            String explanation = "";

            // Check for password length (minimum 8 characters)
            if (password.length() >= 8) {
                System.out.println("Password meets minimum length requirements");
            } else {
                System.out.println("Password does NOT meet minimum length requirements");
                isValid = false;
                explanation += "Too short. ";
            }

            // Check for password case (must contain lowercase)
            if (password.matches(".*[a-z].*")) {
                System.out.println("Password meets lowercase letter requirements");
            } else {
                System.out.println("Password does NOT meet lowercase letter requirements");
                isValid = false;
                explanation += "Missing lowercase letter. ";
            }

            // Check for password case (must contain uppercase)
            if (password.matches(".*[A-Z].*")) {
                System.out.println("Password meets uppercase letter requirements");
            } else {
                System.out.println("Password does NOT meet uppercase letter requirements");
                isValid = false;
                explanation += "Missing uppercase letter. ";
            }

            // Check for password number characters
            if (password.matches(".*[0-9].*")) {
                System.out.println("Password meets number requirements");
            } else {
                System.out.println("Password does NOT meet number requirements");
                isValid = false;
                explanation += "Missing number. ";
            }

            // Check for password special characters (!@#$%)
            if (password.matches(".*[!@#$%].*")) {
                System.out.println("Password meets special characters requirements");
            } else {
                System.out.println("Password does NOT meet special characters requirements");
                isValid = false;
                explanation += "Missing special character (!@#$%). ";
            }

            // Display result for the current password
            if (isValid) {
                System.out.println("Correct");
                correctCount++;
            } else {
                System.out.println("Not correct: " + explanation.trim());
                notCorrectCount++;
            }

            // Ask for the next password
            System.out.println("\nEnter your password: ");
            password = input.nextLine();
        }

        // Display final statistics
        System.out.println("\nConclusion:");
        System.out.println("Number of correct passwords: " + correctCount);
        System.out.println("Number of not correct passwords: " + notCorrectCount);
    }
}
