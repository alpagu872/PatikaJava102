package A_Old_era.MaceraOyunu.Locations.BattleLocations;

import A_Old_era.MaceraOyunu.Player;
import A_Old_era.MaceraOyunu.Villains.Bear;

public class River extends BattleLoc {
    public River(Player player) {
        super(player, "Nehir", new Bear(), "Water", 2);
    }
}
