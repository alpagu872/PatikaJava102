package Generics;

public class Main {
    public static void main(String[] args) {
        //undefined
        String s;

        //null
        String s1 = null;

        //empty
        String s2 = " ";


        String str2 = null;
        String str = "456456";
        Nullable n = new Nullable(str2);
        n.run();

        Integer a = null;
        NullableInteger integer = new NullableInteger(a);
        integer.run();


    }
}
