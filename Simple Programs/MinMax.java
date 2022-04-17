import java.util.*;

public class MinMax {
    public static int MaxOfThree(int a, int b, int c) {
        if (a > b && a > c)
            return a;
        else if (b > a && b > c)
            return b;
        else
            return c;
    }

    public static int MinOfThree(int a, int b, int c) {
        if (a < b && a < c)
            return a;
        else if (b < a && b < c)
            return b;
        else
            return c;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int l = sc.nextInt();
        int m = sc.nextInt();
        System.out.println("Largest num is: " + MaxOfThree(k, l, m));
        System.out.println("Smallest num is: " + MinOfThree(k, l, m));
    }
}