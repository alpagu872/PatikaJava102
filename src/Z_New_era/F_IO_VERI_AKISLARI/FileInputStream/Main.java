package Z_New_era.F_IO_VERI_AKISLARI.FileInputStream;

import java.io.InputStreamReader;
import java.io.FileInputStream;

public class Main {
    public static void main(String[] args) {
        char[] array = new char[100];

        try {
            // FileInputStream
            FileInputStream file = new FileInputStream("input.txt");

            // InputStreamReader
            InputStreamReader input = new InputStreamReader(file);

            int data = input.read();
            while (data != -1) {
                System.out.print((char) data);
                data = input.read();
            }

            input.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

}
