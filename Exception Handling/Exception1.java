import java.util.Scanner;

public class Exception1 {
    public static int factorial(int n) throws IllegalArgumentException {
        if (n < 0) {
            System.out.println("factorial of a negative no. is not possible");
        }
        if (n > 16) {
            System.out.println("value cannot be greater than 16");
        }
        int fac = 1;
        for (int i = n; i > 0; i--)
            fac *= i;
        return fac;
    }

    public static void main(String[] args) throws IllegalArgumentException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        try {
            System.out.println("factorial is" + factorial(n));
        } catch (IllegalArgumentException e) {
        }
    }

}
