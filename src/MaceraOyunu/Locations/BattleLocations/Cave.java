package MaceraOyunu.Locations.BattleLocations;

import MaceraOyunu.Player;
import MaceraOyunu.Villains.Zombie;

import java.util.Random;

public class Cave extends BattleLoc {


    public Cave(Player player) {
        super(player, "Mağara", new Zombie(), "Food",3);
    }
}
