package A_Old_era.ExceptionHandling.TryCatchandFinally;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.println("Program başladı.");
        int a = 1;
        int b = 20;
        int c;
        int[] arr = new int[2];
        try {
            System.out.println("Bölme işlemi:");
            System.out.println(b / a);
            System.out.println("Bölme işlemi bitti.");
            c = girdi.nextInt();
            arr[10] = 11;

        }catch (ArithmeticException arithmeticEx){

            System.out.println("Aritmetik hata.");
            System.out.println(arithmeticEx.getMessage());
        }
        catch (InputMismatchException mismatchException){
            System.out.println("Yanlış girdi.");
            System.out.println(mismatchException.getMessage());
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException){
            System.out.println("Yetersiz dizi boyutu!");
            System.out.println(indexOutOfBoundsException.getMessage());
        }finally {
            System.out.println("Bu kısım kesinlikle çalışacak.");
        }

        System.out.println("Program bitti.");



    }



}
