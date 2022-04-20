package MaceraOyunu;

public class ToolStore extends NormalLoc {
    public ToolStore(Player player) {
        super(player, "Mağaza");
    }

    @Override
    public boolean onLocation() {
        System.out.println("----- -- Mağazaya hoşgeldiniz. -- ----- ");
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
                break;
            case 3:
                System.out.println("HHHAYYYROOLAA HAYYYROOOLAAA HAYYROLA");
                return true;
        }
        return true;

    }

    public void printWeapon() {
        System.out.println("----Silahlar----");
        System.out.println("Tabanca: ");
        for (Weapon w : Weapon.Weapons()) {
            System.out.println(w.getId() + "-" + w.getName() + " Hasar: " + w.getDamage() + " Ücret: " + w.getPrice());
        }
    }

    public void buyWeapon() {
        System.out.println("Bir silah seçiniz: ");

        int selectWeaponID = girdi.nextInt();
        while (selectWeaponID < 1 || selectWeaponID > Weapon.Weapons().length) {// silah eklediğimde burayla tekrar uğraşmamak için direkt dizinin boyutunu aldım.
            System.out.print("Geçersiz değer, tekrar giriniz: ");
            selectWeaponID = girdi.nextInt();
        }

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

    public void printArmor() {
        System.out.println("----Zırhlar----");

    }


}
