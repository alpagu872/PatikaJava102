package NestedAndInnerClasses;

//Outer class
public class Out {

    public int a = 5;
    public static int b = 20;

    //Inner class
    public static class In {

        public static int a = 10;

        public static void run(){
            System.out.println("In sınıfına ait run metodu çalıştı.");
            int a = 1;
            System.out.println(a);
            System.out.println(In.a);
            System.out.println(Out.b);
           // System.out.println(this.a); //Sınıfın a'sını basacak çünkü this deyimi sınıfın x'ini işaret ediyor. (Inner class'ın içindeyiz!)
           // System.out.println(Out.this.a); //Burada ise Out sınıfının a değişkenine erişiyor.

        }
    }

    public void run(){
        In.run();

    }



}
