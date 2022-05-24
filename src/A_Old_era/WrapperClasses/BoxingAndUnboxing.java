package A_Old_era.WrapperClasses;

public class BoxingAndUnboxing {
    //Boxing -İlkel veri tipini wrapper sınıfa çevirme
    //Unboxing -Wrapper sınıfı ilkel veri tipine çevirme
    public static void main(String[] args) {
        //Autoboxing
        int a = 10;
        Integer b = a;

        //Boxing
        Integer c = Integer.valueOf(a);


        //Unboxing
        int i = c.intValue();
        System.out.println(i);
    }


}
