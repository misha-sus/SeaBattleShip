package computers;

import players.Player;
import ships.Vessel;

import java.util.ArrayList;
import java.util.List;

public class Computer implements Player {

    List<Vessel> vessels = new ArrayList<>();

    @Override
    public void getReadyForGame() {

    }

    @Override
    public boolean isReadyToPlay() {
        return false;
    }

    @Override
    public List<Vessel> getVessels() {
        return null;
    }
}
