import java.util.Scanner;

public class SquareNumber {
    public static int squareNo(int n) {
        return n * n;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        System.out.println(squareNo(k));
    }
}
