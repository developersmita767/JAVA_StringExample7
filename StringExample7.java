//Write a program to convert Integer value to String and vice versa
import java.util.Scanner;

public class StringExample7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Integer to String conversion
        System.out.println("Enter an integer value:");
        int intValue = scanner.nextInt();

        // Convert integer to string using String.valueOf() method
        String strValue = String.valueOf(intValue);
        System.out.println("Integer converted to String: " + strValue);

        // String to Integer conversion
        System.out.println("Enter a string value representing an integer:");
        String inputString = scanner.next();

        try {
            // Convert string to integer using Integer.parseInt() method
            int parsedIntValue = Integer.parseInt(inputString);
            System.out.println("String converted to Integer: " + parsedIntValue);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter a valid integer string.");
        }

        scanner.close();
    }
}
