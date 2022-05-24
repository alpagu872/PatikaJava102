package A_Old_era.Collections.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> liste = new LinkedList<>();
        liste.add("Alpagu");
        liste.add("Alpagu");
        liste.add("Alp");
        liste.add("102");

        Iterator<String> itr = liste.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }

}
