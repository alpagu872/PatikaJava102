package Z_New_era.F_IO_VERI_AKISLARI.E_ObjectStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {

        Car c1 = new Car("Mercedes", "CLS63");
        Car c2 = new Car("BMW","740i");

        try {
            FileOutputStream outputFile = new FileOutputStream("src/Z_New_era/F_IO_VERI_AKISLARI/ObjectStream/car.txt");
            ObjectOutputStream output = new ObjectOutputStream(outputFile);
            output.writeObject(c1);
            output.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
