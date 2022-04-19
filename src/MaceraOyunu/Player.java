package MaceraOyunu;

import java.util.Scanner;

public class Player {
    private int damage;
    private int health;
    private int money;
    private String name;
    private String charName;
    private Scanner girdi = new Scanner(System.in);

    public Player(String name) {
        this.name = name;
    }

    public void selectChar() {
        Samurai samurai = new Samurai();
        Knight knight = new Knight();
        Archer archer = new Archer();

        GameChar[] charList = {new Samurai(), new Archer(), new Knight(), new Mage()};

        System.out.println("###############################");
        System.out.println("------Karakterler------");

        for (GameChar cGameChar : charList) {
            System.out.println(cGameChar.getId() + "." + " Karakter : " + cGameChar.getName() + " \tHasar: " + cGameChar.getDamage() + "\t Sağlık: " + cGameChar.getHealth() + "  \t Para: " + cGameChar.getMoney());
        }
        System.out.println("###############################");

        System.out.println("Lütfen bir karakter seçiniz...");

        int selectChar = girdi.nextInt();

        switch (selectChar) {
            case 1:
                initPlayer(new Samurai());
                break;
            case 2:
                initPlayer(new Archer());
                break;
            case 3:
                initPlayer(new Knight());
                break;
            case 4:
                initPlayer(new Mage());
                break;
            default:
                initPlayer(new Samurai());
        }
        System.out.println("Karakter: " + this.getCharName() + ", Hasar. " + this.getDamage() + ", Sağlık: " + this.getHealth() + ", Para: " + this.getMoney());
    }
    public void selectLocation(){
        System.out.println("");
    }

    public void initPlayer(GameChar gameChar) {
        this.setDamage(gameChar.getDamage());
        this.setHealth(gameChar.getHealth());
        this.setMoney(gameChar.getMoney());
        this.setCharName(gameChar.getName());
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }
}
