package Z_New_era.I_Misc.LambdaExpressions;

public class Main {
    public static void main(String[] args) {
//        Runnable r1 = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Runnable Sınıfı");
//            }
//        };
//
//
//        r1.run();
//
//        Runnable r2 = () -> System.out.println("R2 sınıfı");
//        r2.run();
//
//        Runnable r3 = () -> {
//            System.out.println("R3 Sınıfı");
//        };
//        r3.run();


//        Math sum = new Math() {
//            @Override
//            public int transaction(int a, int b) {
//                return a + b;
//            }
//        };
//
//        Math extraction = new Math() {
//            @Override
//            public int transaction(int a, int b) {
//                return a - b;
//            }
//        };
//
//        Math multiply = new Math() {
//            @Override
//            public int transaction(int a, int b) {
//                return a * b;
//            }
//        };
//
//        Math divide = new Math() {
//            @Override
//            public int transaction(int a, int b) {
//                return a/b;
//            }
//        };
//
//        System.out.println(sum.transaction(15,548));

        Math m1 = new Math() {
            @Override
            public int transaction(int a, int b) {
                return 0;
            }
        };

        Math sum = (a, b) -> a + b;
        Math extraction = (a, b) -> a - b;

        Math divide = (a, b) -> {
            if (b == 1) {
                b = 1;
            }
            return a / b;
        };

        Math multiply = (a, b) -> a * b;

        System.out.println(sum.transaction(5, 9));

        System.out.println(multiply.transaction(87, 6));

        System.out.println(divide.transaction(58,3));

        System.out.println(extraction.transaction(899,87));
    }
}

