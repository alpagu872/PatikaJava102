package Z_New_era.F_IO_VERI_AKISLARI.H_OutputStreamWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

public class Main {
    public static void main(String[] args) {
        String data = "ĞÜŞİw";
        try {
            FileOutputStream fileOutput = new FileOutputStream("src/Z_New_era/F_IO_VERI_AKISLARI/H_OutputStreamWriter/output.txt");

            OutputStreamWriter fileWriter = new OutputStreamWriter(fileOutput);

            System.out.println(fileWriter.getEncoding());

            fileWriter.write(data);

            fileWriter.close();
            fileOutput.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
