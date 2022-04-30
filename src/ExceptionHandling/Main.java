package ExceptionHandling;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);

        System.out.println("A sayısını girin");
        int a = girdi.nextInt();
        int b = 10;
        try {
            System.out.println(b / a);
        } catch (Exception ex) {
            System.out.println("Sayı sıfıra bölünemez.");
        } finally {
            System.out.println("Program bitti.");

        }
    }
}
