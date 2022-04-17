import java.util.*;

public class PrimeNo {
    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i < n; i++) {

            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        for (int i = 1; i <= k; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
        sc.close();

    }

}
