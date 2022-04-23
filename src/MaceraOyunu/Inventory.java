package MaceraOyunu;

import MaceraOyunu.Items.Armor;
import MaceraOyunu.Items.Reward;
import MaceraOyunu.Items.Weapon;

public class Inventory {
    private Weapon weapon;
    private Armor armor;
    private Reward reward;

    public Inventory(){
        this.weapon = new Weapon("Yumruk",0,0,0);
        this.armor = new Armor("Çulsuz",0,0,0);
        this.reward = new Reward(0,"Boş");
    }

    public Reward getReward() {
        return reward;
    }

    public void setReward(Reward reward) {
        this.reward = reward;
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
