package MaceraOyunu.Locations.BattleLocations;

import MaceraOyunu.Locations.NeutralLocations.Location;
import MaceraOyunu.Player;
import MaceraOyunu.Villains.Villain;

import java.util.Random;

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
        int count = randomVillainCount();
        System.out.println("Şu an bulunduğunuz yer: " + this.getName());
        System.out.println("Dikkatli ol! Burada " + count + " tane " + this.getVillain().getName() + " yaşıyor !");

        System.out.print("<S>avaş veya <K>aç :");
        String selectFightCase = girdi.nextLine();
        selectFightCase = selectFightCase.toUpperCase();

        if (selectFightCase.equals("S") && combat(count)) {

            System.out.println(this.getPlayer().getName() + " Kazandınız Tebrikler");
            return true;

        }

        if (this.getPlayer().getHealth() <= 0) {
            System.out.println("Öldünüz...");
            return false;
        }

        return true;
    }

    public boolean combat(int villainCount) {

        int counter = 0;
        boolean isFirst = true;

        for (int i = 0; i < villainCount; i++) {
            this.getVillain().setHealth(this.getVillain().getOriginalHealth());
            playerStats();
            villainStats(i + 1);
            int random = rand.nextInt(100);

            while (this.getPlayer().getHealth() > 0 && this.getVillain().getHealth() > 0) {
                System.out.println(counter);
                System.out.print("<V>ur veya <K>aç : ");
                String selectCombat = girdi.nextLine().toUpperCase();

                if (selectCombat.equals("V")) {
                    System.out.println(random);
                    if (isFirst && counter == 0 && random > 50) {
                        System.out.println("İlk siz vurdunuz");
                        this.getVillain().setHealth(this.getVillain().getHealth() - this.getPlayer().getTotalDamage());
                        afterHit();
                        isFirst = false;
                    } else if (random < 50 && isFirst) {
                        System.out.println();
                        System.out.println("İlk " + getVillain().getName() + " size vurdu.");

                        int villainDamage = this.getVillain().getDamage() - this.getPlayer().getInventory().getArmor().getBlock();
                        System.out.println("Canavar size " + villainDamage + " hasar vurdu. ");

                        if (villainDamage < 0) {
                            villainDamage = 0;
                        }
                        this.getPlayer().setHealth(this.getPlayer().getHealth() - villainDamage);
                        afterHit();
                        isFirst = false;
                    }
                    System.out.println("Siz vurdunuz");
                    this.getVillain().setHealth(this.getVillain().getHealth() - this.getPlayer().getTotalDamage());
                    afterHit();

                    if (this.getVillain().getHealth() > 0) {
                        System.out.println();

                        int villainDamage = this.getVillain().getDamage() - this.getPlayer().getInventory().getArmor().getBlock();
                        System.out.println("Canavar size " + villainDamage + " hasar vurdu. ");

                        if (villainDamage < 0) {
                            villainDamage = 0;
                        }
                        this.getPlayer().setHealth(this.getPlayer().getHealth() - villainDamage);
                        afterHit();
                    }
                    counter++;
                } else {
                    return false;
                }
            }

            if (this.getVillain().getHealth() < this.getPlayer().getHealth()) {

                if (!this.getName().equals("Mine")) {

                    System.out.println("Düşmanı yendiniz!");
                    System.out.println(this.getVillain().getDrop() + " birim para kazandınız.");
                    String prize = this.getVillain().getDrop();
                    int prizeInt = this.getPlayer().getMoney() + Integer.parseInt(prize);
                    this.getPlayer().setMoney(prizeInt);
                    System.out.println("Güncel paranız: " + this.getPlayer().getMoney());

                }


            } else {
                return false;
            }
        }
        return true;
    }

    public void afterHit() {
        System.out.println("Canınız: " + this.getPlayer().getHealth());
        System.out.println("Yaratığın canı: " + this.getVillain().getHealth());
        System.out.println();
    }

    public void villainStats(int i) {
        System.out.println();
        System.out.println("************");
        System.out.println(i + "." + this.getVillain().getName() + " değerleri");
        System.out.println("************");
        System.out.println("Sağlık: " + this.getVillain().getHealth());
        System.out.println("Hasar: " + this.getVillain().getDamage());
        System.out.println("Düşecek Loot: " + this.getVillain().getDrop());
        System.out.println();
    }

    public void playerStats() {
        System.out.println();
        System.out.println("************");
        System.out.println("Oyuncu değerleri:");
        System.out.println("************");
        System.out.println("Sağlık: " + this.getPlayer().getHealth());
        System.out.println("Silah: " + this.getPlayer().getInventory().getWeapon().getName());
        System.out.println("Zırh: " + this.getPlayer().getInventory().getArmor().getName());
        System.out.println("Bloklama: " + this.getPlayer().getInventory().getArmor().getBlock());
        System.out.println("Hasar: " + this.getPlayer().getTotalDamage());
        System.out.println("Para: " + this.getPlayer().getMoney());
        System.out.println();

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