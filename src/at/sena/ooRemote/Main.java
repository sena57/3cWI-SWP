package at.sena.ooRemote;

public class Main {
    public static void main(String[]args){
        Remote remote = new Remote();
        Battery battery1 = new Battery(50);
        Battery battery2 = new Battery(30);

        remote.addBattery(battery1);
        remote.addBattery(battery2);

        System.out.println(remote.getBatteries().get(0).getChargingStatus());

        remote.getStatus();
        remote.turnOn(battery1.getChargingStatus());
        remote.turnOff();
    }
}
