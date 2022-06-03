package Z_New_era.F_IO_VERI_AKISLARI.A_File_Classes;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        File dizin = new File("test/path");
        dizin.mkdirs();
        String[] liste = dizin.list();

        for (String str : liste) {
            System.out.println(str);
        }
//        createFile(new File("test/path/Alpagu.txt"));
//        deleteFile(new File("src/Alpagu.txt"));


    }

    static void createFile(File dosya) {
        try {

            if (dosya.createNewFile()) {
                System.out.println(dosya.getName() + " Adlı dosya oluşturuldu.");
            } else {
                System.out.println(dosya.getName() + " Adlı dosya halihazırda mevcut.");
            }

        } catch (IOException e) {

            throw new RuntimeException(e);

        }
    }

    static void deleteFile(File dosya) {
        if (dosya.delete()) {
            System.out.println(dosya.getName() + " Adlı dosya silindi.");
        } else {
            System.out.println(dosya.getName() + " Adlı dosya mevcut değil.");
        }

    }

}

