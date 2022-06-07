package Z_New_era.H_Threads.F_ThreadsHomework;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();

        for (int i = 1; i <10002;i++ ){
            integerList.add(i);
        }
        ExecutorService pool1 = Executors.newFixedThreadPool(4);
        ExecutorService pool2 = Executors.newFixedThreadPool(4);
        ExecutorService pool3 = Executors.newFixedThreadPool(4);
        ExecutorService pool4 = Executors.newFixedThreadPool(4);

        List<Integer> part1 = integerList.subList(0,2500);
        List<Integer> part2 = integerList.subList(2500,5000);
        List<Integer> part3 = integerList.subList(5000,7500);
        List<Integer> part4 = integerList.subList(7000,10000);

        ThreadOp t1 = new ThreadOp(part1);
        pool1.execute(t1);
        ThreadOp t2 = new ThreadOp(part2);
        pool2.execute(t2);
        ThreadOp t3 = new ThreadOp(part3);
        pool3.execute(t3);
        ThreadOp t4 = new ThreadOp(part4);
        pool4.execute(t4);



     }
}
