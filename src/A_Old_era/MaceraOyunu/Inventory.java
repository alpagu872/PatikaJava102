package A_Old_era.MaceraOyunu;

import A_Old_era.MaceraOyunu.Items.Armor;
import A_Old_era.MaceraOyunu.Items.Weapon;

public class Inventory {
    private Weapon weapon;
    private Armor armor;
    private boolean water;
    private boolean firewood;
    private boolean food;


    public Inventory(){
        this.weapon = new Weapon("Yumruk",0,0,0);
        this.armor = new Armor("Çulsuz",0,0,0);

        this.water = false;
        this.firewood = false;
        this.food = false;
    }

    public boolean isWater() {
        return water;
    }

    public void setWater(boolean water) {
        this.water = water;
    }

    public boolean isFirewood() {
        return firewood;
    }

    public void setFirewood(boolean firewood) {
        this.firewood = firewood;
    }

    public boolean isFood() {
        return food;
    }

    public void setFood(boolean food) {
        this.food = food;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public Weapon getWeapon() {
        return weapon;
    }


    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
