import java.util.*;

public class mergedSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a[] = new int[x];
        int y = sc.nextInt();
        int b[] = new int[y];
        for (int i = 0; i < x; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < y; i++) {
            b[i] = sc.nextInt();
        }
        int c[] = new int[x + y];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < x && j < y) {
            if (a[i] < b[j]) {
                c[k] = a[i];
                k++;
                i++;
            } else {
                c[k] = b[j];
                k++;
                j++;
            }
        }
        while (i < x) {
            c[k] = a[i];
            i++;
            k++;
        }
        while (j < y) {
            c[k] = b[j];
            j++;
            k++;
        }
        for (int l = 0; l < k; l++) {
            System.out.print(c[l] + " ");
        }
        sc.close();
    }
}
