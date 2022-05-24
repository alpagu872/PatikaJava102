package A_Old_era.Collections.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class NewMain {
    public static void main(String[] args) {
        List<String> liste = new ArrayList<>();
        liste.add("Ankara");
        liste.add("Urfa");
        liste.add("İzmir");
        liste.add("Çanakkale");
        liste.add("İstanbul");
        System.out.println(liste);

        liste.remove(0);
        System.out.println(liste);

        List<String> liste2 = new ArrayList<>();
        liste2.add("Erzurum");

        liste2.addAll(liste);

        System.out.println(liste2);

    }
}
