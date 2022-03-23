package players.models;

import players.interfaces.Player;
import ships.models.Vessel;

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
