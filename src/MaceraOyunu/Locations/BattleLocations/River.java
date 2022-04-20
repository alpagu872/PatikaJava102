package MaceraOyunu.Locations.BattleLocations;

import MaceraOyunu.Player;
import MaceraOyunu.Villains.Bear;

public class River extends BattleLoc {
    public River(Player player) {
        super(player, "Nehir", new Bear(), "Water", 2);
    }
}
