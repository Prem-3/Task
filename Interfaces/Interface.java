
import java.util.Scanner;

interface in1 {
    void display(int p);
}

class testClass implements in1 {
    public boolean isPrime(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int count(int p) {
        int count = 0;
        for (int i = 2; i <= p; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    public void display(int p) {
        System.out.println(count(p));
    }
}

public class Interface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            testClass t = new testClass();
            t.display(sc.nextInt());
        }
    }
}