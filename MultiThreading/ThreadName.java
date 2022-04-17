public class ThreadName extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        ThreadName t1 = new ThreadName();
        ThreadName t2 = new ThreadName();
        System.out.println(t1.getName());
        t1.start();
        t2.start();
        t1.setName("PK");
        System.out.println("After changing threadName: " + t1.getName());

    }
}
