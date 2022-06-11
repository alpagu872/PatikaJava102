package Z_New_era.I_Misc.StreamAPI;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(487);
        list.add(2124);
        list.add(345);
        list.add(2314);
        list.add(12345);
        list.add(1235);
        list.add(221);
        list.add(232);
        list.add(225);
        list.add(225);
        list.add(225);

        list.stream().forEach(i -> System.out.println(i));
        System.out.println("***********");
        list.stream().filter(num -> num > 1000).forEach(num -> System.out.println(num));
        System.out.println("***********");
        list.stream().distinct().forEach(i -> System.out.println(i)); // unique values
    }
}
