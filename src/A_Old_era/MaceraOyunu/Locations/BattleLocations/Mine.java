package A_Old_era.MaceraOyunu.Locations.BattleLocations;

import A_Old_era.MaceraOyunu.Player;
import A_Old_era.MaceraOyunu.Villains.Snake;

public class Mine extends BattleLoc {
    public Mine(Player player) {
        super(player, "Maden", new Snake(), "Para,Silah veya Zırh", 5);
    }
}
