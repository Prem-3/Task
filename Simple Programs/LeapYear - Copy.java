import java.util.*;

public class LeapYear {
    public static void leapYear(int n) {
        if (((n % 4 == 0) && (n % 100 != 0)) || (n % 400 == 0)) {
            System.out.println(n + " is a LeapYear");
        } else
            System.out.println(n + " is not a LeapYear");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        leapYear(k);
    }
}
