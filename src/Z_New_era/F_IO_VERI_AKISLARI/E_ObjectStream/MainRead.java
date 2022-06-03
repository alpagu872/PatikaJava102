package Z_New_era.F_IO_VERI_AKISLARI.E_ObjectStream;


import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class MainRead {
    public static void main(String[] args) {


        try {
            FileInputStream inputFile = new FileInputStream("src/Z_New_era/F_IO_VERI_AKISLARI/ObjectStream/car.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(inputFile);
            Car newCar = (Car) objectInputStream.readObject();
            System.out.println(newCar.getBrand());
            System.out.println(newCar.getModel());

            objectInputStream.close();
            inputFile.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
