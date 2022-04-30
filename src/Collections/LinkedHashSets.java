package Collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSets {
    public static void main(String[] args) {

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(20);
        linkedHashSet.add(43);
        linkedHashSet.add(230);
        linkedHashSet.add(10);

        Iterator<Integer> iterator = linkedHashSet.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }



    }
}
