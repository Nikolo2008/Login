package Basic;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userName = scanner.nextLine();
        StringBuilder password = new StringBuilder();

        for (int position = userName.length() - 1; position >= 0; position--) {
            char currentChar = userName.charAt(position);
            password.append(currentChar);

        }
        int incorect = 0;
        String enteredPassword = scanner.nextLine();

        while (!enteredPassword.contentEquals(password)) {

            incorect++;

            if (incorect == 4) {
                System.out.printf("Username %s blocked", userName);
                break;
            }
            System.out.printf("Invalid password. Please try again.%n");

            enteredPassword = scanner.nextLine();
        }
        if (enteredPassword.contentEquals(password)) {
            System.out.printf("Username %s successfully logged in", userName);
        }


    }
}
