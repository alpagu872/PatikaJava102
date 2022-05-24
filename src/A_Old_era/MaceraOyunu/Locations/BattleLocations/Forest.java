package A_Old_era.MaceraOyunu.Locations.BattleLocations;

import A_Old_era.MaceraOyunu.Player;
import A_Old_era.MaceraOyunu.Villains.Vampire;

public class Forest extends BattleLoc {
    public Forest(Player player) {
        super(player, "Orman", new Vampire(), "Firewood", 3);
    }
}
