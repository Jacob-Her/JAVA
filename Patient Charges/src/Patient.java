// Jacob Her
// CSCI 2001-52
// HW2 (Ch6) - Patient Charges

public class Patient
{
    private String fName;
    private String mName;
    private String lName;
    private String stAdd;
    private String city;
    private String state;
    private String zip;
    private String ph;
    private String eContName;
    private String eContPh;

    //Constructor that accepts an argument for each field

    public Patient (String fName, String mName, String lName, String stAdd,
                    String city, String state, String zip, String ph, String eContName,
                    String eContPh)
    {
        this.fName = fName;
        this.mName = mName;
        this.lName = lName;
        this.stAdd = stAdd;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.ph = ph;
        this.eContName = eContName;
        this.eContPh = eContPh;
    }

    /*Accessors*/

    public String getfName()
    {
        return fName;
    }

    public String getmName()
    {
        return mName;
    }

    public String getlName()
    {
        return lName;
    }

    public String getStAdd()
    {
        return stAdd;
    }

    public String getCity()
    {
        return city;
    }

    public String getState()
    {
        return state;
    }

    public String getZip()
    {
        return zip;
    }

    public String getPh()
    {
        return ph;
    }

    public String geteContName()
    {
        return eContName;
    }

    public String geteContPh()
    {
        return eContPh;
    }

    /*Mutators for each field*/

    public void setfName (String fName)
    {
        this.fName = fName;
    }

    public void setmName (String mName)
    {
        this.mName = mName;
    }

    public void setlName (String lName)
    {
        this.lName = lName;
    }

    public void setStAdd (String stAdd)
    {
        this.stAdd = stAdd;
    }

    public void setCity (String city)
    {
        this.city = city;
    }

    public void setState (String state)
    {
        this.state = state;
    }

    public void setZip (String zip)
    {
        this.zip = zip;
    }

    public void setPh (String ph)
    {
        this.ph = ph;
    }

    public void seteContName (String eContName)
    {
        this.eContName = eContName;
    }

    public void seteContPh (String eContPh)
    {
        this.eContPh = eContPh;
    }
}
