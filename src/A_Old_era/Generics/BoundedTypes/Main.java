package A_Old_era.Generics.BoundedTypes;

public class Main {
    public static void main(String[] args) {
        //Integer, Double, Float extends Number
        A aObj = null;

        Nullable<A> n1 = new Nullable<>(aObj);
        n1.run();



    }
}
