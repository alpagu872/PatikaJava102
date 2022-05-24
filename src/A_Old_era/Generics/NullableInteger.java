package A_Old_era.Generics;

public class NullableInteger {
    private final Integer value;

    public NullableInteger(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public boolean isNull() {
        return this.getValue() == null;
    }

    public void run() {
        if (isNull()) {
            System.out.println("Bu değişkene bir değer atanmamıştır. (Null)");
        } else {
            System.out.println(this.value);
        }
    }
}
