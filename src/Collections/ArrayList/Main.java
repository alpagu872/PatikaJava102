package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> liste = new ArrayList<>();
        liste.add(10);
        liste.add(12);
        liste.add(21);
        liste.add(20);
        liste.add(35);
        liste.add(21);
        liste.add(22);
        liste.add(null);

//        Iterator<Integer> iterator = liste.iterator();
//
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

        System.out.println("Liste boyutu: " +liste.size());
        System.out.println(liste);
/*        System.out.println(liste.get(5));
        System.out.println(liste.indexOf(21));
        System.out.println(liste.lastIndexOf(21));*/
        liste.add(2,15);
        System.out.println("Liste boyutu: " +liste.size());
        System.out.println(liste);
        System.out.println(liste.contains(15));
        System.out.println(liste);
        System.out.println(liste.remove(2));
        System.out.println(liste);

    }
}
