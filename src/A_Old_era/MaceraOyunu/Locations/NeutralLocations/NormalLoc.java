package A_Old_era.MaceraOyunu.Locations.NeutralLocations;

import A_Old_era.MaceraOyunu.Player;

public class NormalLoc extends Location {
    public NormalLoc(Player player, String name) {
        super(player, name);
    }

    @Override
    public boolean onLocation() {
        return true;
    }
}
