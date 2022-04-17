import java.lang.Math;

class GFG {
    public static boolean ValidSubsequence(int[] seq) {
        if ((seq[0] < seq[1]) || (seq[-1] < seq[-2])) {
            return false;
        }
        int i = 0, j;
        while (i < seq.length - 1) {
            if (seq[i] < seq[i + 1]) {
                j = i + 1;
                if ((j != (seq.length) - 1) && (seq[j] > seq[j + 1])) {
                    return false;
                }
            }
            i += 1;
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 5;
        int k = (int) Math.ceil(n / 2);
        int arr[] = new int[n];
        for (int i = 1; i <= n; i++) {
            arr[i - 1] = i;
        }
    }
}