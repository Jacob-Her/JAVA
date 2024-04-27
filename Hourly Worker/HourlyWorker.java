// Jacob Her
// CSCI 2001-52
// HW10(Ch11) - Hourly Worker

import java.util.Scanner;

public class HourlyWorker {

    public static void main(String[] args) {
        // Constructor
        double hourlyWage;

        Scanner kb = new Scanner(System.in);

        // User input
        System.out.print("Please enter your hourly wage: $");

        hourlyWage = kb.nextDouble();

        try {
            // Call the constructor
            HourlyWage wage = new HourlyWage(hourlyWage);
        }
        catch (NegativeHourlyWage obj) {
            System.out.println("Custom Exception: " + obj.getMessage());
        }
    }
}
