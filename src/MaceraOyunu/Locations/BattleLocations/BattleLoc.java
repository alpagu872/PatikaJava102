package MaceraOyunu.Locations.BattleLocations;

import MaceraOyunu.Items.Armor;
import MaceraOyunu.Items.Weapon;
import MaceraOyunu.Locations.NeutralLocations.Location;
import MaceraOyunu.Player;
import MaceraOyunu.Villains.Villain;

import java.util.Random;

public abstract class BattleLoc extends Location {
    private Villain villain;
    private String award;
    private int maxVillain;
    protected Random random = new Random();

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
            int firstHitChanceRand = rand.nextInt(100);

            while (this.getPlayer().getHealth() > 0 && this.getVillain().getHealth() > 0) {
                System.out.println(counter);
                System.out.print("<V>ur veya <K>aç : ");
                String selectCombat = girdi.nextLine().toUpperCase();

                if (selectCombat.equals("V")) {
                    System.out.println(firstHitChanceRand);
                    if (isFirst && counter == 0 && firstHitChanceRand > 50) {
                        System.out.println("İlk siz vurdunuz");
                        this.getVillain().setHealth(this.getVillain().getHealth() - this.getPlayer().getTotalDamage());
                        afterHit();
                        isFirst = false;
                    } else if (firstHitChanceRand < 50 && isFirst) {
                        System.out.println();
                        System.out.println("İlk " + getVillain().getName() + " size vurdu.");
                        villainHitCalc();
                        isFirst = false;
                    }
                    System.out.println("Siz vurdunuz");
                    this.getVillain().setHealth(this.getVillain().getHealth() - this.getPlayer().getTotalDamage());
                    afterHit();
                    if (this.getVillain().getHealth() > 0) {
                        System.out.println();
                        villainHitCalc();
                    }
                    counter++;
                } else {
                    return false;
                }
            }

            if (this.getVillain().getHealth() < this.getPlayer().getHealth()) {

                if (!this.getName().equals("Maden")) {
                    afterDefeatUsualRegion();
                } else if (this.getName().equals("Maden")) {
                    defeatAfterMineRegionPrizes();
                }

            } else {
                return false;
            }
        }
        return true;
    }

    private void villainHitCalc() {
        int villainDamage = this.getVillain().getDamage() - this.getPlayer().getInventory().getArmor().getBlock();
        if (villainDamage < 0) {
            villainDamage = 0;
        }
        System.out.println("Canavar size " + villainDamage + " hasar vurdu. ");
        this.getPlayer().setHealth(this.getPlayer().getHealth() - villainDamage);
        afterHit();
    }

    public void afterHit() {
        System.out.println("Canınız: " + this.getPlayer().getHealth());
        System.out.println("Yaratığın canı: " + this.getVillain().getHealth());
        System.out.println();
    }

    public void afterDefeatUsualRegion() {
        System.out.println("Düşmanı yendiniz!");
        System.out.println(this.getVillain().getDrop() + " birim para kazandınız.");
        String prize = this.getVillain().getDrop();
        int prizeInt = this.getPlayer().getMoney() + Integer.parseInt(prize);
        this.getPlayer().setMoney(prizeInt);
        System.out.println("Güncel paranız: " + this.getPlayer().getMoney());
    }

    public void defeatAfterMineRegionPrizes() {
        int randomPrize = random.nextInt(100) + 1;

        if (randomPrize <= 15) {

            //recieving randomly one weapon for killing the monster
            int randomWeapon = random.nextInt(100) + 1;

            if (randomWeapon <= 20) {

                this.getPlayer().getInventory().setWeapon(new Weapon("Tabanca", 1, 2, 15));

            }
            if (randomWeapon > 20 && randomWeapon <= 50) {

                this.getPlayer().getInventory().setWeapon(new Weapon("Kılıç", 2, 3, 35));

            }
            if (randomWeapon > 50 && randomWeapon <= 100) {

                this.getPlayer().getInventory().setWeapon(new Weapon("Tüfek", 3, 7, 45));

            }
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println(this.getPlayer().getName() + ", Yeni bir silah düşürdünüz: '" + this.getPlayer().getInventory().getWeapon().getName());
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        } else if (randomPrize > 15 && randomPrize <= 30) {

            //recieving randomly one Archor for killing the monster
            int randomArchor = random.nextInt(100) + 1;

            if (randomArchor <= 20) {

                this.getPlayer().getInventory().setArmor(new Armor("Ağır", 3, 5, 40));

            } else if (randomArchor > 20 && randomArchor <= 50) {

                this.getPlayer().getInventory().setArmor(new Armor("Orta", 2, 3, 25));

            } else if (randomArchor > 50 && randomArchor <= 100) {

                this.getPlayer().getInventory().setArmor(new Armor("Hafif", 1, 1, 15));

            }

            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println(this.getPlayer().getName() + ", Yeni bir zırh düşürdünüz: '" + this.getPlayer().getInventory().getArmor().getName());
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        } else if (randomPrize > 30 && randomPrize <= 55) {

            //recieving randomly Money for killing the monster
            int randomMoney = random.nextInt(100) + 1;
            int balace = this.getPlayer().getMoney();

            if (randomMoney <= 20) {

                this.getPlayer().setMoney(balace + 10);
            } else if (randomMoney > 20 && randomMoney <= 50) {

                this.getPlayer().setMoney(balace + 5);
            } else if (randomMoney > 50 && randomMoney <= 100) {

                this.getPlayer().setMoney(balace + 1);
            }

            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            System.out.printf(this.getPlayer().getName() + " Yılanı öldürdüğünüz için " + (this.getPlayer().getMoney() - balace) + " birim para kazandınız.\n");
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        } else if (randomPrize > 55 && randomPrize <= 100) {

            // the player wont recieve any thing for kinlling the monster
            // because the randomPrize is bitween (55,100]
        }
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