package Z_New_era.H_Threads.F_ThreadsHomework;

import java.util.ArrayList;
import java.util.List;

public class ThreadOp implements Runnable {

    List<Integer> tekSayilar = new ArrayList<>();
    List<Integer> ciftSayilar = new ArrayList<>();
    List<Integer> subArr;

    public ThreadOp(List<Integer> subArr) {
        this.subArr = subArr;
    }

    @Override
    public void run() {
        find(this.subArr);
        print(Thread.currentThread().getName());

    }

    private synchronized void find(List<Integer> subArr) {
        for (int i = 0; i < subArr.size(); i++) {
            int num = subArr.get(i);
            if (num % 2 == 0) {
                ciftSayilar.add(num);
            } else {
                tekSayilar.add(num);

            }
        }
    }

    private void print(String threadName){
        System.out.println(threadName + ": " + ciftSayilar);
        System.out.println(threadName + ": " + tekSayilar);

    }
}
