package ships.models;

import ships.interfaces.Damager;
import ships.interfaces.Sailable;

public class Vessel implements Sailable {
    Point[] decks;
    Damager damager;

    public Vessel(int decks) {
        if (decks > 5) {
            this.decks = new Point[decks];

        } else System.out.println("Ошибочка дружок. Так не подойдет!!!");
    }

    @Override
    public void sail() {
    }

    public void attack() {
        damager.damager();
    }

    public int getLengthDesks() {
        return decks.length;
    }
}
