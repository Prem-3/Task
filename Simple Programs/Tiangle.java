import java.util.*;

public class Tiangle {
    public static void typeOfTrinagle(int a, int b, int c) {
        if (a == b && b == c)
            System.out.println("Equilateral triangle");
        else if (a != b && b != c)
            System.out.println("Scalene triangle");
        else
            System.out.println("Isosceles triangle");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int l = sc.nextInt();
        int m = sc.nextInt();
        typeOfTrinagle(k, l, m);
    }
}
