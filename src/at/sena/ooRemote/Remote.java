package at.sena.ooRemote;

import java.util.ArrayList;
import java.util.List;

public class Remote {
private List<Battery> batteries;

public Remote(){
    this.batteries = new ArrayList<>();
}

public void addBattery(Battery battery) { this.batteries.add(battery); }
}
