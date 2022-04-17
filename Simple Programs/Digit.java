import java.util.*;

public class Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i, r = 0, d;
        i = n;
        while (n != 0) {
            d = n % 10;
            r = r * 10 + d;
            n = n / 10;
        }
        System.out.print(r);
        System.out.println();
        sc.close();
    }
}