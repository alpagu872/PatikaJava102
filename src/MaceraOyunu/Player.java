package MaceraOyunu;

import MaceraOyunu.CharClasses.Archer;
import MaceraOyunu.CharClasses.Knight;
import MaceraOyunu.CharClasses.Mage;
import MaceraOyunu.CharClasses.Samurai;
import MaceraOyunu.Items.Weapon;

import java.util.Scanner;

public class Player {
    private int damage;
    private int health;
    private int money;
    private int defaultHealth ;
    private String name;
    private String charName;
    private Scanner girdi = new Scanner(System.in);
    private Inventory inventory;

    public Player(String name) {
        this.name = name;
        this.inventory = new Inventory();
    }

    public int getDefaultHealth() {
        return defaultHealth;
    }

    public void setDefaultHealth(int defaultHealth) {
        this.defaultHealth = defaultHealth;
    }

    public void selectChar() {

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


    public void initPlayer(GameChar gameChar) {
        this.setDamage(gameChar.getDamage());
        this.setHealth(gameChar.getHealth());
        this.setDefaultHealth(gameChar.getHealth());
        this.setMoney(gameChar.getMoney());
        this.setCharName(gameChar.getName());
    }

    public void printInfo() {

        System.out.println(
                " Silahınız: " + this.getInventory().getWeapon().getName() +
                "\n Zırhınız:  " + this.getInventory().getArmor().getName() +
                "\n Hasarınız:  " + this.getTotalDamage() +
                "\n Defansınız:  " + this.getInventory().getArmor().getBlock() +
                "\n Sağlık: " + this.getHealth() +
                "\n Para: " + this.getMoney());

    }

    public int getTotalDamage(){
        return damage + this.getInventory().getWeapon().getDamage();
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
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
        if (health < 0 ){
            health = 0;
        }
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

    public Weapon getWeapon(){
        return this.getInventory().getWeapon();
    }
}
