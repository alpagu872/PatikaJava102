package Z_New_era.H_Threads.D_CritSectionsAndRaceCond;

public class OrderMatic implements Runnable {
    private int orderNo;
    private final Object LOCK = new Object();

    public OrderMatic(int orderNo) {
        this.orderNo = 1;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        increaseOrder();


    }

    public synchronized void increaseOrder() {
        this.orderNo++;
        System.out.println(Thread.currentThread().getName() + " - OrderNo => " + this.orderNo);
    }


    public int getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo;
    }
}
