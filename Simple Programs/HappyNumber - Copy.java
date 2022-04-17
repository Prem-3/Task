import java.util.Scanner;

public class HappyNumber {

    public static int number(int n) {
        int t, d, sum = 0;
        while (n != 0) {
            d = n % 10;
            sum += (d * d);
            n = n / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = n;
        while (k != 1 && k != 4) {
            k = number(k);
        }
        if (k == 1)
            System.out.println(n + " " + "is a happy number");
        else
            System.out.println(n + " " + "is not a happy number");
    }
}
