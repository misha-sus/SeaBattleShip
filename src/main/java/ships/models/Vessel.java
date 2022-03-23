package ships.models;

import ships.interfaces.Damager;
import ships.interfaces.Sailable;

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
