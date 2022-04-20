package MaceraOyunu;

import java.util.Scanner;

public class Game {
    public Scanner girdi = new Scanner(System.in);


    public void start() {

        System.out.println("Macera oyununa hoşgeldiniz.");
        System.out.print("Lütfen bir isim giriniz: ");
        //String playerName = girdi.nextLine();

        Player player = new Player("Alpagu");
        System.out.println("Sayın " + player.getName() + " bu karanlık ve sisli diyara hoşgeldin.");
        System.out.println("Burada yaşananların hepsi palavra...");
        System.out.println("Lütfen oyuna başlamak için bir karakter seçiniz: ");
        player.selectChar();

        Location location = null;
        while (true) {
            player.printInfo();
            System.out.println();
            System.out.println("Bölgeler:");
            System.out.println();
            System.out.println("1 - Güvenli EV");
            System.out.println("2 - Mağaza --> Ekipman veya zırh alabilirsiniz.");
            System.out.println("Lütfen gitmek istediğiniz bölgeyi seçiniz: ");
            int selectLoc = girdi.nextInt();

            switch (selectLoc) {
                case 0:
                    location = null;
                    break;
                case 1:
                    location = new SafeHouse(player); // Polymorphism
                    break;
                case 2:
                    location = new ToolStore(player);
                    break;
                default:
                    location = new SafeHouse(player);
            }

            if (location == null){
                System.out.println("Oyun bitti.");
                break;
            }
            if (!location.onLocation()) {
                System.out.println("Game over.");
                break;
            }


        }


    }
}
