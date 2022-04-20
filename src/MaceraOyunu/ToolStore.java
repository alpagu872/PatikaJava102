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
        for (Weapon w :Weapon.Weapons()){
            System.out.println(w.getName() + " Hasar: "+ w.getDamage() + " Ücret: " +w.getPrice());
        }



    }

    public void printArmor() {
        System.out.println("----Zırhlar----");

    }


}
