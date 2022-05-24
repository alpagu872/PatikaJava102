package Z_New_era.C_KitapSiralayici;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("War and Peace", 1225, "Tolstoy", 1867);
        Book book2 = new Book("Crime and Punishment", 576, "Dostoevsky", 1866);
        Book book3 = new Book("Utopia", 359, "Thomas More", 1516);
        Book book4 = new Book("Alice in WonderLand", 208, "Lewis Carroll",1865);
        Book book5 = new Book("The Brothers Karamazov", 840, "Dostoevsky",1879);


        LinkedHashSet<Book> bookSet = new LinkedHashSet<>();
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book4);
        bookSet.add(book5);

        for (Book book: bookSet) {
            System.out.printf("Book Name: %-25s Page: %5d\n", book.getName(), book.getPageCount());


        }
    }
}
