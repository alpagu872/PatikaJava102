package Z_New_era.H_Threads.C_ThreadStopAndStart;

public class Counter implements Runnable {
    private String name;
    private int id;
    private boolean isRun = true;

    public Counter(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println(this.getName() + " Çalıştı ! ");
        int i = 0;
        while (isRun) {

                try {
                    Thread.sleep(1000L * this.id);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(" " + this.getName() + " : " + i++);

        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void stop() {
        this.isRun = false;
    }
}