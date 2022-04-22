package MaceraOyunu.Villains;

import java.util.Random;

public class Villain {
    private int id;
    private int damage;
    private int health;
    private int dropLootMoney;
    private String name;
    private int originalHealth;

    public Villain(String name, int id, int damage, int health, int dropLootMoney) {
        this.id = id;
        this.damage = damage;

        if (this.id == 4) {
            int calcDamage = 0, baseDamage = 3;
            Random random = new Random();
            int rand = random.nextInt(3);
            calcDamage += baseDamage + rand;
            System.out.println(calcDamage);
            this.damage = calcDamage;


        }
        this.originalHealth = health;
        this.health = health;
        this.name = name;
        this.dropLootMoney = dropLootMoney;
    }


    public int getDropLootMoney() {
        return dropLootMoney;
    }

    public void setDropLootMoney(int dropLootMoney) {
        this.dropLootMoney = dropLootMoney;
    }

    public int getOriginalHealth() {
        return originalHealth;
    }

    public void setOriginalHealth(int originalHealth) {
        this.originalHealth = originalHealth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        if (health < 0) {
            health = 0;
        }
        this.health = health;
    }
}
