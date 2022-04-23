package MaceraOyunu;

import MaceraOyunu.Locations.BattleLocations.Cave;
import MaceraOyunu.Locations.BattleLocations.Forest;
import MaceraOyunu.Locations.BattleLocations.Mine;
import MaceraOyunu.Locations.BattleLocations.River;
import MaceraOyunu.Locations.NeutralLocations.Location;
import MaceraOyunu.Locations.NeutralLocations.SafeHouse;
import MaceraOyunu.Locations.NeutralLocations.ToolStore;

import java.util.Scanner;

public class Game {
    public Scanner girdi = new Scanner(System.in);


    public void start() {

        System.out.println("Macera oyununa hoşgeldiniz.");
        System.out.print("Lütfen bir isim giriniz: ");
        String playerName = girdi.nextLine();

        Player player = new Player(playerName);
        System.out.println("Sayın " + player.getName() + " bu karanlık ve sisli diyara hoşgeldin.");
        System.out.println("Burada yaşananların hepsi palavra...");
        System.out.println("Lütfen oyuna başlamak için bir karakter seçiniz: ");
        player.selectChar();

        Location location = null;
        while (true) {
            if (isWin(player)) {
                System.out.println("| Oyunu başarıyla bitirdiniz. |");
                break;
            }

            System.out.println();
            System.out.println("Bölgeler:");
            System.out.println();
            System.out.println("1 - Güvenli EV");
            System.out.println("2 - Mağaza --> Ekipman veya zırh alabilirsiniz.");
            System.out.println("3 - Mağaraya gir.");
            System.out.println("4 - Ormana git.");
            System.out.println("5 - Nehir Bölgesine git.");
            System.out.println("6 - Madene git.");
            System.out.println("7 - Kabine git.");
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
                case 3:
                    location = new Cave(player);
                    break;
                case 4:
                    location = new Forest(player);
                    break;
                case 5:
                    location = new River(player);
                    break;
                case 6:
                    location = new Mine(player);
                    break;
                case 7:
                    player.printInfo();
                    location = new SafeHouse(player);
                    break;
                default:

                    location = new SafeHouse(player);
                    break;
            }
            if (location == null) {
                System.out.println("Oyun bitti.");
                break;
            }
            if (!location.onLocation()) {
                System.out.println("Game over.");
                break;
            }


        }


    }

    public boolean isWin(Player player) {
        return player.getInventory().isWater() && player.getInventory().isFood() && player.getInventory().isFirewood();

    }
}
