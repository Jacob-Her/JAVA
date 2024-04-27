// Jacob Her
// CSCI 2001-52
// HW10(Ch11) - Hourly Worker

public class HourlyWage extends HourlyWorker{
    private double hourlyWage;

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public HourlyWage (double wage) throws NegativeHourlyWage {
        super();
        if (wage < 0) {
            // Calling and Creating an Exception Object
            NegativeHourlyWage obj1 = new NegativeHourlyWage (wage);
            throw obj1;
        }
        hourlyWage = wage;
    }
}
