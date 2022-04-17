import java.util.*;

public class UnionArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] a1 = new int[m];
        int[] a2 = new int[n];
        for (int i = 0; i < m; i++) {
            a1[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            a2[i] = sc.nextInt();
        }
        int c = 0;
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                if (a1[i] == a2[j])
                    c++;

        System.out.println((n + m) - c);

    }
}