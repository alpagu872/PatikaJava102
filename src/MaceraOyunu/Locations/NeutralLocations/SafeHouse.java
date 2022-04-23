package MaceraOyunu.Locations.NeutralLocations;

import MaceraOyunu.Player;

public class SafeHouse extends NormalLoc{
    public SafeHouse(Player player) {
        super(player,"Güvenli EV");
    }
    @Override
    public boolean onLocation() {
        this.getPlayer().setHealth(this.getPlayer().getDefaultHealth());
        System.out.println("Güvenli evdesiniz.");
        System.out.println("Canınız yenilendi.");
        return true;
    }
}
