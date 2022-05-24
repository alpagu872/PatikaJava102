package A_Old_era.MaceraOyunu.Locations.BattleLocations;

import A_Old_era.MaceraOyunu.Player;
import A_Old_era.MaceraOyunu.Villains.Zombie;

public class Cave extends BattleLoc {


    public Cave(Player player) {
        super(player, "Mağara", new Zombie(), "Food",3);
    }
}
