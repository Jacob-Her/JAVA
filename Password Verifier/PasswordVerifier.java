// Jacob Her
// CSCI 2001-52
// HW7(Ch9) - Password Verifier

import java.util.Scanner;

public class PasswordVerifier {

    public static final int PASSWORD_LENGTH = 6;

    public static void main(String[] args) {

        // Scanner and Console prompt
        Scanner input = new Scanner(System.in);
        System.out.print(
                "Please enter your password below\n" +
                " Password Criteria\n" +
                " - The password should be at least six characters.\n" +
                " - The password should contain at least one uppercase and at least one lowercase letter.\n" +
                " - The password should have at least one digit. \n" +
                "Enter your Password here: ");

        String s = input.nextLine();

        // Displays result of the password
        if (is_Valid_Password(s)) {
            System.out.println("Password is valid: " + s);
        } else {
            System.out.println("Not a valid password: " + s + "\n(Please check your Password, to make sure it meets the criteria above)" );
        }
    }

    // Tests the password against the parameters created
    public static boolean is_Valid_Password(String password) {

        if (password.length() < PASSWORD_LENGTH)
            return false;

        int charCount = 0;
        int numCount = 0;
        for (int i = 0; i < password.length(); i++) {

            char ch = password.charAt(i);

            if (has_Numeric(ch)) numCount++;
            else if (up_Letter(ch) && lo_Letter(ch)) charCount++;
            else
                return false;
        }
        return (charCount >= 2 && numCount >= 1);
    }

    public static boolean up_Letter(char ch) {
        ch = Character.toUpperCase(ch);
        return (ch >= 'A' && ch <= 'Z');
    }

    public static boolean lo_Letter(char ch) {
        ch = Character.toLowerCase(ch);
        return (ch >= 'a' && ch <= 'z');
    }

    public static boolean has_Numeric(char ch) {
        return (ch >= '0' && ch <= '9');
    }
}