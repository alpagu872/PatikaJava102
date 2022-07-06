package Z_New_era.F_IO_VERI_AKISLARI.K_PrintWriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        String data = "JAVA102";

        File dosya = new File("src/Z_New_era/F_IO_VERI_AKISLARI/K_PrintWriter/output.txt");

        try {
            PrintWriter writer = new PrintWriter(dosya);

            writer.print(data);
            writer.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
