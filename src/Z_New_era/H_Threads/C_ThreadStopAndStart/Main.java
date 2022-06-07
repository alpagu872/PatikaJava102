package Z_New_era.H_Threads.C_ThreadStopAndStart;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter c1 = new Counter("C1", 1);
        Counter c2 = new Counter("C2", 2);
        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);

        t1.start();
        Thread.sleep(1000);
        c1.stop();

        t2.start();
    }
}
