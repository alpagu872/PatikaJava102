package NestedAndInnerClasses;

public class LocalClass {

    public void run(){

        //Yerel sınıfların kullanımı

        class Yerel{

            private int a;
            public Yerel(int a){
                this.a = a;
            }

            public int getA() {
                return a;
            }

            public void setA(int a) {
                this.a = a;
            }
        }
        Yerel y = new Yerel(15);
        System.out.println("Local sınıfı çalıştı.");
        System.out.println(y.getA());
    }

    public void print(){

    }
}
