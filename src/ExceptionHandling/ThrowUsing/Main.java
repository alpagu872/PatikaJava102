package ExceptionHandling.ThrowUsing;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int age = girdi.nextInt();
        checkAge(age);

        System.out.println("Program bitti.");

    }

    public static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Dışarı çıkamazsınız");
        } else {
            System.out.println("Yaşı uygundur.");
        }
    }

}
