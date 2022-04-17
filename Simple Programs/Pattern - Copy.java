import java.util.*;

public class Pattern {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // sc.close();
            for (int j = 2 * (n - i); j > 0; j--) {
                System.out.print("  ");
            }

            for (int k = 0; k < i; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
/*
 * *
 * * * *
 * * * * * *
 * * * * * * * *
 * * * * * * * * * *
 */
