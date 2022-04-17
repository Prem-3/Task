import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int d, t, s = 0;
        t = n;
        while (n != 0) {
            d = n % 10;
            s = s * 10 + d;
            n = n / 10;
        }
        if (s == t) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
        sc.close();
    }
}
