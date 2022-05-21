package Collections.TreeSets;

import java.util.Comparator;
import java.util.PriorityQueue;

public class TestCompare {
    public static void main(String[] args) {

        Comparator<Integer> compareForEven = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int result = o1 % 2 - o2 % 2;
                if (result == 0) {
                    result = o1 - o2;
                }
                return result;
            }
        };


        PriorityQueue<Integer> pq = new PriorityQueue<>(20, compareForEven);

        for (int i = 0 ; i < 20 ; i++){
            pq.offer(20-i);
        }
        for (int i = 0 ; i < 20 ; i++){
            System.out.println("\t" + pq.poll());
        }
    }


}
