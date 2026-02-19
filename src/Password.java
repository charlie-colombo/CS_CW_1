import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your password: ");
        String password = input.nextLine();

        while (!password.equals("END")) {

            if (password.length() >= 8) {
                if (password.matches(".*[a-z].*") && password.matches(".*[A-Z].*") && password.matches(".*[0-9].*") && password.matches(".*[@#$%^&+=].*")) {
                    System.out.println("Password accepted");
                    break;
                } else {
                    System.out.println("Password must contain at least one lowercase letter, one uppercase letter, one number, and one special character");

                }
            } else {
                System.out.println("Password must be at least 8 characters long");

            }

            System.out.println("Enter your password: ");
            password = input.nextLine();

        }
    }
}