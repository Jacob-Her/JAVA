// Jacob Her
// CSCI 2001-52
// HW2 (Ch6) - Patient Charges

public class Application
{
    public static void main (String[] args)
    {
        //creating one instance of Patient class
        Patient pat=new Patient("Joe","Smoe","Doe","1234 Street","Minneapolis","MN","55111","12345678","Joanne Doe", "87654321");

        //creating 3 instances of Procedure class

        Procedure p1 = new Procedure("Physical Exam","Today's Date","Dr. Irvine",250);
        Procedure p2 = new Procedure("X-ray","Today's Date","Dr. Jamison",500);
        Procedure p3 = new Procedure("Blood Test","Today's Date","Dr. Smith",200);

        //Display Patient Information

        System.out.println("Patient name: "+pat.getfName() +","+ pat.getmName() +","+ pat.getlName());
        System.out.println("Patient Address: "+pat.getStAdd()+","+pat.getCity()+","+pat.getState()+","+pat.getZip());
        System.out.println("Patient Phone Number: "+pat.getPh());
        System.out.println("Patient's Emergency Contact and Phone Number: "+pat.geteContName()+","+pat.geteContPh()+"\n");

        //Displaying Procedures Information

        System.out.println("First Procedure Name: "+p1.getpName()+"\tDate: "+p1.getpDate()+"\tDoctor Name: "+p1.getdName()+"\tCharge: $"+p1.getCharge());
        System.out.println("Second Procedure Name: "+p2.getpName()+"\tDate: "+p2.getpDate()+"\tDoctor Name: "+p2.getdName()+"\tCharge: $"+p2.getCharge());
        System.out.println("Third Procedure Name: "+p3.getpName()+"\tDate: "+p3.getpDate()+"\tDoctor Name: "+p3.getdName()+"\tCharge: $"+p3.getCharge());

        //Computing Total Charge for 3 Procedures

        double totalCharge = p1.getCharge()+p2.getCharge()+p3.getCharge();

        System.out.println("\nTotal Charge for these 3 procedures: $"+totalCharge);

    }
}