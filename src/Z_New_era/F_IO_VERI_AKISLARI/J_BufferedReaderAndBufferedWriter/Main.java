package Z_New_era.F_IO_VERI_AKISLARI.J_BufferedReaderAndBufferedWriter;

import java.io.*;
import java.nio.charset.Charset;

public class Main {
    public static void main(String[] args) {
//        try {
//            FileReader readFile = new FileReader("patika.txt");
//            BufferedReader readBuff = new BufferedReader(readFile);
////            String line = readBuff.readLine();
////            while (line != null){
////                System.out.println(line);
////                line = readBuff.readLine();
////            }
//
//            String line;
//            while (((line = readBuff.readLine()) != null)){
//                System.out.print(line + " #### ");
//            }
//
//
//
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }

        String data = "JAVAÖĞRENİYORUMDATAÜÜÜ";
        File dosya = new File("src/Z_New_era/F_IO_VERI_AKISLARI/J_BufferedReaderAndBufferedWriter/output.txt");
        try {
            FileWriter writeFile = new FileWriter(dosya);
            BufferedWriter writeBuff = new BufferedWriter(writeFile);


            writeBuff.write(data);



            writeBuff.close();
            writeFile.close();



        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
