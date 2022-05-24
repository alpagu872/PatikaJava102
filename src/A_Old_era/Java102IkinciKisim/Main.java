package A_Old_era.Java102IkinciKisim;

//Encapsulation (Kapsülleme)
//Inheritance (Kalıtım)
//Polimorphism (Çok Biçimlilik)
//Abstraction (Soyutlama)

public class Main {


    public static void main(String[] args) {
        Book harryPotter = new Book("Harry Potter 1", 150);
        Book lordOfTheRings = new Book("Lord OF The Rings", 5151);

        System.out.println(lordOfTheRings.getPageNumber());
        lordOfTheRings.changePageNumber(10000);
        System.out.println(lordOfTheRings.getName());
        lordOfTheRings.setName("TEST");
        System.out.println(lordOfTheRings.getPageNumber());
        System.out.println(lordOfTheRings.getName());
    }
}
