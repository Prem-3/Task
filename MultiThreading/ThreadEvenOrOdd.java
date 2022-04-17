class Number {
    static int limit = 25;
    int i = 1;

    synchronized void displayOdd() {
        while (i < limit) {
            while (i % 2 != 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                }
            }
            System.out.println((i++));
            notifyAll();
        }
    }

    synchronized void displayEven() {
        while (i < limit) {
            while (i % 2 == 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                }

            }
            System.out.println((i++));
            notifyAll();
        }
    }
}

public class ThreadEvenOrOdd {
    public static void main(String[] args) {
        final Number n = new Number();

        Thread t1 = new Thread() {
            public void run() {
                n.displayOdd();
            }
        };

        Thread t2 = new Thread() {
            public void run() {
                n.displayEven();
            }
        };

        long startTime = System.nanoTime();

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
        }

        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        System.out.println("Execution time in nanoseconds: " + timeElapsed);
        System.out.println("Execution time in milliseconds: " + timeElapsed / 1000000);
    }
}