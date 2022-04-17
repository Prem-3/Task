import java.util.*;

public class EvenOrOdd {
    public static void evenOdd(int n) {
        if (n % 2 == 0)
            System.out.println("even");
        else
            System.out.println("odd");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        evenOdd(k);
    }
}