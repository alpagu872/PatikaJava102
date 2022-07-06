package Z_New_era.F_IO_VERI_AKISLARI.J_BufferedReaderAndBufferedWriter;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        try {
            FileReader readFile = new FileReader("patika.txt");
            BufferedReader readBuff = new BufferedReader(readFile);
//            String line = readBuff.readLine();
//            while (line != null){
//                System.out.println(line);
//                line = readBuff.readLine();
//            }

            String line;
            while (((line = readBuff.readLine()) != null)){
                System.out.print(line + " #### ");
            }



        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
