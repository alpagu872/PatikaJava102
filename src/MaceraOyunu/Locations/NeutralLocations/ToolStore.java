package MaceraOyunu.Locations.NeutralLocations;

import MaceraOyunu.Items.Armor;
import MaceraOyunu.Items.Weapon;
import MaceraOyunu.Player;

public class ToolStore extends NormalLoc {
    public ToolStore(Player player) {
        super(player, "Mağaza");
    }

    @Override
    public boolean onLocation() {

        System.out.println("----- -- Mağazaya hoşgeldiniz. -- ----- ");
        boolean showMenu = true;

        while (showMenu) {
            System.out.println("1 - Silahlar");
            System.out.println("2 - Zırhlar");
            System.out.println("3 - Çıkış Yap");

            System.out.print("Seçiminiz: ");
            int selectCase = girdi.nextInt();
            while (selectCase < 1 || selectCase > 3) {
                System.out.print("Geçersiz değer, tekrar giriniz: ");
                selectCase = girdi.nextInt();

            }
            switch (selectCase) {
                case 1:
                    printWeapon();
                    buyWeapon();
                    break;
                case 2:
                    printArmor();
                    buyArmor();
                    break;
                case 3:
                    System.out.println("HHHAYYYROOLAA HAYYYROOOLAAA HAYYROLA");
                    showMenu = false;
                    break;
            }
        }
        return true;
    }

    public void printWeapon() {
        System.out.println("----Silahlar----");
        for (Weapon w : Weapon.Weapons()) {
            System.out.println(w.getId() + "-" + w.getName() + " Hasar: " + w.getDamage() + " Ücret: " + w.getPrice());
        }
        System.out.println("Çıkış için '0' ");
    }

    public void buyWeapon() {
        System.out.println("Bir silah seçiniz: ");

        int selectWeaponID = girdi.nextInt();
        while (selectWeaponID < 0 || selectWeaponID > Weapon.Weapons().length) {// silah eklediğimde burayla tekrar uğraşmamak için direkt dizinin boyutunu aldım.
            System.out.print("Geçersiz değer, tekrar giriniz: ");
            selectWeaponID = girdi.nextInt();
        }

        if (selectWeaponID != 0){
            Weapon selectedWeapon = Weapon.getWeaponObjById(selectWeaponID);
            if (selectedWeapon != null) {
                if (selectedWeapon.getPrice() > this.getPlayer().getMoney()) {
                    System.out.println("Yetersiz para.");
                } else {
                    //SATIN ALMA İŞLEMİNİN GERÇEKLEŞTİĞİ ALAN
                    System.out.println(selectedWeapon.getName() + " Satın alındı.");

                    int balance = this.getPlayer().getMoney() - selectedWeapon.getPrice();

                    this.getPlayer().setMoney(balance);

                    System.out.println("Güncel bakiyeniz: " + this.getPlayer().getMoney());
                    System.out.println("Önceki silahınız: " + this.getPlayer().getInventory().getWeapon().getName());
                    this.getPlayer().getInventory().setWeapon(selectedWeapon);
                    System.out.println("Güncel silahınız: " + this.getPlayer().getInventory().getWeapon().getName());
                }
            }
        }

    }

    public void printArmor() {
        System.out.println("----Zırhlar----");

        for (Armor a : Armor.armors()) {
            System.out.println(a.getId() + "-" + a.getName() + " Zırh değeri: " + a.getBlock() + " Fiyat: " + a.getPrice());
        }
        System.out.println("Çıkış için '0' ");


    }

    public void buyArmor() {
        System.out.println("Bir Zırh seçiniz: ");

        int selectArmorID = girdi.nextInt();
        while (selectArmorID < 0 || selectArmorID > Armor.armors().length) {// Zırh eklediğimde burayla tekrar uğraşmamak için direkt dizinin boyutunu aldım.
            System.out.print("Geçersiz değer, tekrar giriniz: ");
            selectArmorID = girdi.nextInt();
        }

        if (selectArmorID != 0){
            Armor selectedArmor = Armor.getArmorObjById(selectArmorID);
            if (selectedArmor != null) {
                if (selectedArmor.getPrice() > this.getPlayer().getMoney()) {
                    System.out.println("Yetersiz para.");
                } else {
                    //SATIN ALMA İŞLEMİNİN GERÇEKLEŞTİĞİ ALAN
                    System.out.println(selectedArmor.getName() + " Satın alındı.");

                    int balance = this.getPlayer().getMoney() - selectedArmor.getPrice();

                    this.getPlayer().setMoney(balance);

                    System.out.println("Güncel bakiyeniz: " + this.getPlayer().getMoney());
                    System.out.println("Önceki zırhınız: " + this.getPlayer().getInventory().getArmor().getName());
                    this.getPlayer().getInventory().setArmor(selectedArmor);
                    System.out.println("Güncel zırhınız: " + this.getPlayer().getInventory().getArmor().getName());
                }
            }
        }



    }


}
