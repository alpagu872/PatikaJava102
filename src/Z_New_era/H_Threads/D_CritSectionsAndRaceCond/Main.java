package Z_New_era.H_Threads.D_CritSectionsAndRaceCond;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws InterruptedException {


        OrderMatic orderMatic = new OrderMatic(0);


        ExecutorService pool = Executors.newFixedThreadPool(50);


        for (int i = 1; i < 100; i++) {
            pool.execute(orderMatic);
        }


        System.out.println(orderMatic.getOrderNo());

    }
}
