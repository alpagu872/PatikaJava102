package ExceptionHandling.ThrowUsing;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner girdi = new Scanner(System.in);
        int age = girdi.nextInt();
        try {
            checkAge(age);
        }catch (Exception e){
            System.out.println("Hata");
        }

        System.out.println("Program bitti.");

    }

    public static void checkAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Dışarı çıkamazsınız");
        } else {
            System.out.println("Yaşı uygundur.");
        }
    }

}
