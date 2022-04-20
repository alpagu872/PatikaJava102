package MaceraOyunu.Locations.BattleLocations;

import MaceraOyunu.Player;
import MaceraOyunu.Villains.Vampire;

public class Forest extends BattleLoc {
    public Forest(Player player) {
        super(player, "Orman", new Vampire(), "Firewood", 3);
    }
}
