package Z_New_era.F_IO_VERI_AKISLARI.C_FileOutStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String yazi = "Output Classes";

        try {
            File dosya = new File("src/Z_New_era/F_IO_VERI_AKISLARI/FileOutStream/patika.txt");

            FileOutputStream outputStream = new FileOutputStream(dosya,true);
            byte[] yaziByte = yazi.getBytes();
            outputStream.write(yaziByte);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

}
}
