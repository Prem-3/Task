import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            a[i] += 1;
        }
        Arrays.sort(a);
        System.out.println("Highest values in the array are:");
        for (int i = n - 1; i > 4; i--) {
            System.out.println(a[i]);
        }
    }
}
