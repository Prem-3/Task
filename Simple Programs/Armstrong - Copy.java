import java.util.*;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i, a, s = 0;
        i = n;
        while (n != 0) {
            a = n % 10;
            s = s + (a * a * a);
            n = n / 10;
        }
        if (s == i) {
            System.out.println("Armstrong");
        } else {
            System.out.println("NOT an Armstrong");
        }
    }
}
