package Z_New_era.F_IO_VERI_AKISLARI.I_FileWriterAndFileReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("output.txt");
            fileReader.skip(1); // ilk karakteri atlayabilir skip metodu ile

            int i = fileReader.read(); // okunan karakteri bir int değeri atıyor ascii değerine dönüştürüp.
            while (i != -1) {
                System.out.print((char) i); // type casting yaparak char'a dönüşüm sağlıyoruz ve ekrana char halini basıyoruz.
                i = fileReader.read(); // ve işlemi sürdürüyoruz.
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    String data = "JAVA ÖĞRİĞÜĞÜİŞÜ";
    FileWriter fileWriter;


        try {
            fileWriter = new FileWriter("src/Z_New_era/F_IO_VERI_AKISLARI/I_FileWriterAndFileReader/output.txt");
            fileWriter.write("HAHA TEST DENEME YAZDIRMA DENEMESİ.");
            fileWriter.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

}}
