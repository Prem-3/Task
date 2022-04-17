import java.util.*;

public class MatrixMult {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int c = sc.nextInt();
        int d = sc.nextInt();
        if (b != c) {
            System.out.println("Not valid");
        } else {
            int x[][] = new int[a][b];
            int y[][] = new int[c][d];
            int product[][] = new int[a][d];

            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    x[i][j] = sc.nextInt();
                }
            }

            for (int i = 0; i < c; i++) {
                for (int j = 0; j < d; j++) {
                    y[i][j] = sc.nextInt();
                }
            }

            for (int i = 0; i < a; i++) {
                for (int j = 0; j < d; j++) {
                    product[i][j] = 0;
                    for (int k = 0; k < c; k++) {
                        product[i][j] += x[i][k] * y[k][j];
                    }
                    System.out.print(product[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
