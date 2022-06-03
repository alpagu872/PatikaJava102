package Z_New_era.F_IO_VERI_AKISLARI.F_BufferedStream;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {

        try {


            FileInputStream inputStream = new FileInputStream("src/Z_New_era/F_IO_VERI_AKISLARI/F_BufferedStream/patika.txt");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);

            int i = bufferedInputStream.read();
            while (i != -1) {
                System.out.print((char) i);
                i = bufferedInputStream.read();
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
