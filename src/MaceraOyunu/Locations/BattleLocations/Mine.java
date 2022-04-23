package MaceraOyunu.Locations.BattleLocations;

import MaceraOyunu.Player;
import MaceraOyunu.Villains.Snake;
import MaceraOyunu.Villains.Villain;

public class Mine extends BattleLoc {
    public Mine(Player player) {
        super(player, "Maden", new Snake(), "Para,Silah veya Zırh", 5);
    }
}
