package A_Old_era.ExceptionHandling.ThrowUsing;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner girdi = new Scanner(System.in);
        int age = girdi.nextInt();
        try {
            checkAge(age);
        } catch (AgeCheckException e) {
            throw new RuntimeException(e);
        }
    }


    public static void checkAge(int age) throws AgeCheckException {
        if (age < 18) {
            throw new AgeCheckException("Yaş hatası !");
        } else {
            System.out.println("Yaşı uygundur.");
        }
    }

}
