package ships;

import ships.typeOfShip.Sailable;

public class Vessel implements Sailable {
   Point[] points = new Point[10];
   Damager damager;

    @Override
    public void sail() {
    }

    public void attack(){
        damager.damager();
    }
}
