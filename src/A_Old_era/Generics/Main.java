package A_Old_era.Generics;

public class Main {
    public static void main(String[] args) {
        Integer a = 10;
        String b = "Alpagu";
        Double d = 3.14;
        String c = "Dev";
        Nullable<Integer> integerNullable = new Nullable<>(a);
        //integerNullable.run();

        Test<Double, String, Integer> test = new Test(d, b, a);
        test.showInfo();


    }
}
