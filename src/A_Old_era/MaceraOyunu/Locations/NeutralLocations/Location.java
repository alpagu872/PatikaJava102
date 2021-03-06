package A_Old_era.MaceraOyunu.Locations.NeutralLocations;

import A_Old_era.MaceraOyunu.Player;

import java.util.Random;
import java.util.Scanner;

public abstract class Location {
    private Player player;
    private String name;
    protected Scanner girdi = new Scanner(System.in);
    protected Random rand = new Random();

    public Location(Player player, String name) {
        this.player = player;
        this.name = name;

    }

    public abstract boolean onLocation();

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
