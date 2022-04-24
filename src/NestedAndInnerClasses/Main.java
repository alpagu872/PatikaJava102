package NestedAndInnerClasses;

public class Main {
    //Nested Class (İç içe sınıflar)
    // -Inner classes(İç sınıflar)
    //  - Static
    //  - Non-static
    // -Local Class (Yerel Sınıflar)
    // -Anonymous Classes (Anonim Sınıflar)

    public static void main(String[] args) {

        LocalClass l = new LocalClass();
//        l.run();
        Anonim a = new Anonim(){
            public int a = 20;

            @Override
            public void run(){
                System.out.println(this.a);
                System.out.println("Anonim olarak yazılmış run metodu");
                print();// override edilmiş metodun üzerinden çağırmakta herhangi bir problem yok.
            }

            public void print(){
                System.out.println("Print metodu");
            }

        };
        a.run();
        //a.print() // a nesnesinden üretilmiş sınıfta print() metodu olmadığı için hata alıyoruz.
         }








}
