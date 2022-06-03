package Z_New_era.F_IO_VERI_AKISLARI.B_FileInputStream;

import java.io.File;
import java.io.FileInputStream;


public class Main {
    public static void main(String[] args) {
        try {
            File dosya = new File("src/Z_New_era/F_IO_VERI_AKISLARI/FileInputStream/patika.txt");

            FileInputStream inputStream = new FileInputStream(dosya);
            System.out.println("Kullanılır byte sayısı: " + inputStream.available());
            inputStream.read();
            inputStream.read();
            inputStream.read();
            inputStream.read();
            System.out.println("Kullanılır byte sayısı: " + inputStream.available());


            inputStream.skip(10);
            int i = inputStream.read();
            while (i != -1){
                System.out.print((char) i);
                i = inputStream.read();
            }
            inputStream.close();


        } catch (Exception e) {

            System.out.println(e.getMessage());

        }

    }
}
