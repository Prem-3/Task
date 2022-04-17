import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

class PhoneNumber {
    String countryCode;
    String phNo;

    PhoneNumber(String countryCode, String phNo) {
        this.countryCode = countryCode;
        this.phNo = phNo;
    }

    @Override
    public String toString() {
        return countryCode + "-" + phNo;
    }
}

class IndianPhoneNumber extends PhoneNumber {
    IndianPhoneNumber(String phNo) {
        super("+91", phNo);
    }
}

class UserInputs {
    static String firstName;
    static String lastName;
    static String email;
    static String password;
    static IndianPhoneNumber[] phoneNumber;
    static Date date;

    public UserInputs(String firstName, String lastName, String email, String password, IndianPhoneNumber[] phoneNumber,
            Date date) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.date = date;
    }

    public static boolean isValidAlphabet(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!(Character.isLetter(s.charAt(i))))
                return false;
        }
        return true;
    }

    public static boolean isValidPhoneNumber(String ph) {
        int n = ph.length();
        if (n < 10)
            return false;
        for (int i = 0; i < n; i++) {
            if (!(ph.charAt(i) >= '0' && ph.charAt(i) <= '9'))
                return false;
        }
        return true;
    }

    public static boolean isValidEmail(String email) {
        int op = 0;
        int s = 0;
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == ' ')
                return false;
            if (email.charAt(i) == '@')
                s++;
            if (email.charAt(i) == '.')
                op++;
        }
        return (op > 0 && s > 0);
    }

    public static boolean isValidPassword(String pass) {

        if (!(pass.length() >= 8 && pass.length() <= 16)) {
            return false;
        }
        for (int i = 0; i < pass.length(); i++) {

            if (pass.charAt(i) >= '0' && pass.charAt(i) <= '9') {
                return true;
            }
        }

        return false;

    }

    public static boolean isValidDateOfBirth(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        return ((cal.get(Calendar.MONTH) >= 1 || cal.get(Calendar.MONTH) <= 12)
                && (cal.get(Calendar.DATE) >= 1 || cal.get(Calendar.DATE) <= 31)
                && (cal.get(Calendar.YEAR) >= 1900 || cal.get(Calendar.YEAR) <= 2009));

    }

    public static void validate() throws IllegalArgumentException {

        if (!(isValidAlphabet(firstName) && isValidAlphabet(lastName))) {
            throw new IllegalArgumentException("Please Enter only alphabetic characters in name.");
        }
        if (!isValidPassword(password)) {
            throw new IllegalArgumentException(
                    "The length of password should be between 8 to 16 charcaters and it must include atleast one digit");

        }
        if (!isValidEmail(email)) {
            throw new IllegalArgumentException("Email must contain @ and '.' Example: abc@gmail.com");
        }

        IndianPhoneNumber[] phone = phoneNumber;
        for (int i = 0; i < phone.length; i++) {
            if (!isValidPhoneNumber(phone[i].phNo))
                throw new IllegalArgumentException("Phone nnumber must contain only digits and should be of 10 digits");
        }
        if (!isValidDateOfBirth(date))
            throw new IllegalArgumentException("Invalid Date Of Birth");

    }

    @Override
    public String toString() {
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd E");
        return "Inputs [email=" + email + ", firstName=" + firstName + ", lastName=" + lastName + ", password="
                + password + "DOB: " + f.format(date) + ", phoneNumber=" + Arrays.toString(phoneNumber) + "]";
    }

}

public class UserInputValid {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your firstname: ");
        String firstName = sc.next();
        System.out.println("Enter your lastname: ");
        String lastName = sc.next();
        System.out.println("Enter your email: ");
        String email = sc.next();
        System.out.println("Enter your password: ");
        String password = sc.next();

        System.out.println("Enter number of phonenumbers: ");
        int n = sc.nextInt();
        sc.nextLine();
        IndianPhoneNumber[] phoneNumbers = new IndianPhoneNumber[n];
        System.out.println("enter the phonenumbers");
        for (int i = 0; i < n; i++) {
            phoneNumbers[i] = new IndianPhoneNumber(sc.next());
        }
        System.out.println("Enter your date of birth: ");
        Date date = new Date();
        try {
            date = new SimpleDateFormat("yyyy-MM-dd").parse(sc.next());
        } catch (ParseException e) {
            System.out.println(e.getMessage());
        }

        UserInputs input = new UserInputs(firstName, lastName, email, password, phoneNumbers, date);
        try {
            UserInputs.validate();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(input);

    }

}
