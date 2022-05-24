package A_Old_era.Collections;

import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        HashSet<Integer> hSet = new HashSet<>();
        hSet.add(10);
        hSet.add(20);
        hSet.add(10);
        hSet.add(30);

        Iterator<Integer> itr = hSet.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }


    }
}
