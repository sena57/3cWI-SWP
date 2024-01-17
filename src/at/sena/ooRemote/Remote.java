package at.sena.ooRemote;

import java.util.ArrayList;
import java.util.List;

public class Remote {
    private List<Battery> batteries;

    public Remote() {
        this.batteries = new ArrayList<>();
    }

    public void addBattery(Battery battery) {
        this.batteries.add(battery);
    }

    public List<Battery> getBatteries() {
        return batteries;
    }

    public void getStatus(){
        int result = (getBatteries().get(0).getChargingStatus() + getBatteries().get(1).getChargingStatus()) / 2;
        System.out.println(result);
    }

    public void turnOn(){
        for (int i = 0; i < batteries.size(); i++) {
            System.out.println("Verbraucher angeschlossen");
            int result = this.batteries.getChargingStatus() - 5;
        }
    }

    public void turnOff(){
        for (int i = 0; i < batteries.size(); i++) {
            System.out.println("Kein Verbraucher angeschlossen");
        }

    }
}
