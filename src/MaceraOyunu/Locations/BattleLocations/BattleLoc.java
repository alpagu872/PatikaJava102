package MaceraOyunu.Locations.BattleLocations;

import MaceraOyunu.Locations.NeutralLocations.Location;
import MaceraOyunu.Player;
import MaceraOyunu.Villains.Villain;

public abstract class BattleLoc extends Location {
    private Villain villain;
    private String award;
    private int maxVillain;

    public BattleLoc(Player player, String name, Villain villain, String award, int maxVillain) {
        super(player, name);
        this.villain = villain;
        this.award = award;
        this.maxVillain = maxVillain;
    }


    @Override
    public boolean onLocation() {
        System.out.println("Şu an bulunduğunuz yer: " + this.getName());
        System.out.println("Dikkatli ol! Burada " + randomVillainCount() + " tane " + this.getVillain().getName() + " yaşıyor !");

        System.out.print("<S>avaş veya <K>aç :");
        String selectFightCase = girdi.nextLine();

        selectFightCase.toUpperCase();

        if (selectFightCase.equals("S")) {

            System.out.println("Savaş İşlemleri Olacak");

        }
        return true;
    }

    public boolean combat(int villainCount) {
        for (int i = 1; i <= villainCount; i++) {
            playerStats();
            villainStats();

        }

        return false;
    }
    public void villainStats(){
        System.out.println(this.getVillain().getName()+ " değerleri");
        System.out.println("************");
        System.out.println("Sağlık: "  + this.getVillain().getHealth());
        System.out.println("Hasar: " + this.getVillain().getDamage());
        System.out.println("Düşecek Loot: " + this.getVillain().getDropLootMoney());
    }

    public void playerStats() {
        System.out.println("Oyuncu değerleri:");
        System.out.println("************");
        System.out.println("Sağlık: " + this.getPlayer().getHealth());
        System.out.println("Silah: " + this.getPlayer().getInventory().getWeapon().getName());
        System.out.println("Zırh" + this.getPlayer().getInventory().getArmor().getName());
        System.out.println("Bloklama" + this.getPlayer().getInventory().getArmor().getBlock());
        System.out.println("Hasar: " + this.getPlayer().getTotalDamage());
        System.out.println("Para: " + this.getPlayer().getMoney());

    }


    public int randomVillainCount() {
        return (int) (Math.random() * 3 + 1);
    }

    public int getMaxVillain() {
        return maxVillain;
    }

    public void setMaxVillain(int maxVillain) {
        this.maxVillain = maxVillain;
    }

    public Villain getVillain() {
        return villain;
    }

    public void setVillain(Villain villain) {
        this.villain = villain;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }
}
