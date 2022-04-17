import java.util.*;

public class DisplayValue {
    public static int value(int m) {
        return m > 0 ? 1 : ((m < 0) ? -1 : 0);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        System.out.println(value(3));
    }
}
