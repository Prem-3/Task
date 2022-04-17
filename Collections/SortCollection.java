import java.util.*;

interface Client {
    double getCharges();

    double calculatePayment(GregorianCalendar invoiceDate);

    void sendEmail(double payment);
}

class Clients implements Client,  Comparable<Clients>{
    int id;
    String name;
    String email;
    double charges;
    GregorianCalendar dateOfAgreement;

    public Clients(int id, String name, String email, double charges, GregorianCalendar dateOfAgreement) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.charges = charges;
        this.dateOfAgreement = dateOfAgreement;
    }

    
    @Override 
    public double getCharges(){
     

    }
     
    @Override 
    p

        System.out.println("sent email with the pending amount "+ payment);
    } 
    @Override
    public double calculatePayment(GregorianCalendar invoiceDate){
        long diff = invoiceDate.getTime() - this.dateOfAgreement.getTime();
     

    }
    @Override
    public int compareTo(Clients c){
        if(this.id>c.id) return 1;
     
 

    } 

c

    public Business(int id, S

        this.name = name;
        this.email = email;
        this.charges = charges;
        this.dateOfAgreement 
}
double getGst(){
    return this.gst;
}
public double calculatePayment(GregorianCalendar invoiceDate) {
    return (double) (getCharges()*this.gstRate * (invoiceDate.get(Calendar.DATE) - dateOfAgreement.get(Calendar.DATE)));
}

@Override
public String toString() {
    return "Business [charges=" + charges + ", dateOfAgreement=" + dateOfAgreement.getTime() + ", email=" + email
            + ", gstRate=" + gstRate + ", id=" + id + ", name=" + name + "]\n";
}

}
public class SortCollection {
public static void main(String[] args) {
   Client customer1=new Customer(100, "pk", "pk@gmail.com", 12.0, new GregorianCalendar(2022, 2, 8);
   Client customer2=new Customer(200, "prem", "prem@gmail.com", 18.0, new GregorianCalendar(2022, 2, 9);
   Client Business1=new Business(300, "xyz", "xyz3@gmail.com", 24.0, new GregorianCalendar(2022, 1, 8);
   Client Business2=new Business(400, "pqr", "pqr143@gmail.com", 36.0, new GregorianCalendar(2022, 1, 9);
List<




}
    
}