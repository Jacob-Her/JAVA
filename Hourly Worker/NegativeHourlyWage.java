// Jacob Her
// CSCI 2001-52
// HW10(Ch11) - Hourly Worker

public class NegativeHourlyWage extends Exception{
    public NegativeHourlyWage (double wage) {
        super("Error: The hourly wage cannot be negative." + wage);
    }
}

