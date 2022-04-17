import java.util.Scanner;

public class FibonacciUsingRecur {
    public static int Recursion(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else
            return Recursion(n - 1) + Recursion(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Fibonacci Series of " + n + " numbers is : " + Recursion(n));
        // for (int i = 0; i < n; i++) {
        // System.out.print(Recursion(n));
        // }
    }
}