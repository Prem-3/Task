public class StartandRundiff extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        StartandRundiff t1 = new StartandRundiff();
        StartandRundiff t2 = new StartandRundiff();
        t1.start();
        t2.start();
    }
}
