// Jacob Her
// CSCI 2001-52
// HW2 (Ch6) - Patient Charges

public class Procedure
{
    private String pName;
    private String pDate;
    private String dName;
    private double charge;

    //Constructor that accepts an argument for each field

    public Procedure (String pName, String pDate, String dName, double charge)
    {
        this.pName = pName;
        this.pDate = pDate;
        this.dName = dName;
        this.charge = charge;
    }

    //Accessor methods for each field

    public String getpName ()
    {
        return pName;
    }

    public String getpDate ()
    {
        return pDate;
    }

    public String getdName ()
    {
        return dName;
    }

    public double getCharge ()
    {
        return charge;
    }

    //Mutator methods for each field

    public void setpName(String pName)
    {
        this.pName = pName;
    }

    public void setpDate(String pDate)
    {
        this.pDate = pDate;
    }

    public void setdName(String dName)
    {
        this.dName = dName;
    }

    public void setCharge(double charge)
    {
        this.charge = charge;
    }

}
