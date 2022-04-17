import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
import java.time.LocalDate;

interface Client {
    double getCharge();

    double calculatePayment(String invoiceDate);

    void sendEmail(double payment);
}

class Customer implements Client {
    int id;
    String name;
    String email;
    double charges;
    String dateOfAgreement;

    public Customer(int id, String name, String email, double charges, String dateOfAgreement) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.charges = charges;
        this.dateOfAgreement = dateOfAgreement;
    }

    @Override
    public double getCharge() {
        return charges;
    }

    static long getDays(String join_date, String leave_date) {
        SimpleDateFormat obj = new SimpleDateFormat("MM-dd-yyyy");
        try {
            Date date1 = obj.parse(join_date);
            Date date2 = obj.parse(leave_date);
            long time_difference = date2.getTime() - date1.getTime();
            long days_difference = (time_difference / (1000 * 60 * 60 * 24)) % 365;

            return days_difference;
        } catch (ParseException excep) {
            return -1;
        }
    }

    @Override
    public double calculatePayment(String invoiceDate) {
        return getDays(invoiceDate, getTodaydate()) * getCharge();
    }

    private static String getTodaydate() {
        LocalDate todaysDate = LocalDate.now();
        return todaysDate.toString();
    }

    @Override
    public void sendEmail(double payment) {

    }

    @Override
    public String toString() {
        return "Customer [charges=" + charges + ", dateOfAgreement=" + dateOfAgreement + ", email=" + email + ", id="
                + id + ", name=" + name + "]";
    }

}

class Business implements Client {
    int id;
    String name;
    String email;
    double charges;
    double gstRate;
    String dateOfAgreement;

    public Business(int id, String name, String email, double charges, double gstRate, String dateOfAgreement) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.charges = charges;
        this.gstRate = gstRate;
        this.dateOfAgreement = dateOfAgreement;
    }

    @Override
    public double getCharge() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public double calculatePayment(String invoiceDate) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void sendEmail(double payment) {
        // TODO Auto-generated method stub

    }

    @Override
    public String toString() {
        return "Business [charges=" + charges + ", dateOfAgreement=" + dateOfAgreement + ", email=" + email
                + ", gstRate=" + gstRate + ", id=" + id + ", name=" + name + "]";
    }

}

public class SortandCoupling {
    public static void main(String[] args) {
        Client c1 = new Customer(1, "PK", "PK@gmail.com", 200, "02/16/2022");
    }
}