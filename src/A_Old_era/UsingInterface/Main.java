package A_Old_era.UsingInterface;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner girdi = new Scanner(System.in);


        System.out.print("Tutar giriniz: ");
        double price = girdi.nextDouble();
        girdi.nextLine();

        System.out.println("Kart no giriniz : ");
        String cardNo = girdi.nextLine();


        System.out.println("Son kullanma tarihi: ");
        String date = girdi.nextLine();


        System.out.print("Güvenlik kodu: ");
        String cvc = girdi.nextLine();

        System.out.println("1. A BANKASI");
        System.out.println("2. B BANKASI");
        System.out.println("3. C BANKASI");
        int secim = girdi.nextInt();
        switch (secim) {
            case 1:
                ABankasi aPos = new ABankasi("A bankası", "212312312", "5446645");
                aPos.connect("127.1.1.1");
                aPos.payment(price, cardNo, date, cvc);
                break;
            case 2:
                BBankasi bPos = new BBankasi("B", "454564465", "4646556");
                bPos.connect("123.0.0.1");
                bPos.payment(price, cardNo, date, cvc);
                break;
            default:
                System.out.println("Geçerli banka giriniz.");
                break;
        }


    }
}
