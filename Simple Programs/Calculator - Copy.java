class Cal {
    private int sum;

    Cal() {
        sum = 0;
    }

    void add(int a, int b) {
        sum = a + b;
    }

    void add(int a, int b, int c) {
        sum = a + b + c;
    }

    void add(int... arr) {
        sum = 0;
        for (int i : arr) {
            sum += i;
        }
    }

    void getSum() {
        System.out.println(sum);
    }
}

public class Calculator {
    public static void main(String[] args) {
        Cal op = new Cal();
        op.add(3, 0);
        op.getSum();
        op.add(0, 0, 4);
        op.getSum();
        op.add(0, 1, 2, 3, 4);
        op.getSum();
    }
}