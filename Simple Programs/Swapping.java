import java.util.*;

public class Swapping {
    public static void swap(int a, int b) {
        System.out.println("before Swapping" + " " + a + " " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("after Swapping" + " " + a + " " + b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int m = sc.nextInt();

        swap(k, m);
        sc.close();
    }
}
