package Z_New_era.F_IO_VERI_AKISLARI.D_ByteInputAndOutputStream;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        byte[] dizi = {1,2,3,4,54,67, 32};
        ByteArrayInputStream input = new ByteArrayInputStream(dizi,1, 2);
        int i = input.read();

        while (i != -1){
            System.out.println(i);
            i = input.read();
        }
        try {

            input.close();
        } catch (IOException e) {

            throw new RuntimeException(e);
        }
    }
}
