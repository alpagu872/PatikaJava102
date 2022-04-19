package MaceraOyunu;

import java.util.Scanner;

public class Game {
    public Scanner girdi = new Scanner(System.in);


    public void start() {

        System.out.println("Macera oyununa hoşgeldiniz.");
        System.out.print("Lütfen bir isim giriniz: ");
        String playerName = girdi.nextLine();

        Player player = new Player(playerName);
        System.out.println("Sayın "+ player.getName() + " bu karanlık ve sisli diyara hoşgeldin.");
        System.out.println("Burada yaşananların hepsi palavra...");


    }
}
