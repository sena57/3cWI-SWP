package at.sena.ooCar;

public class Tank {
private int fuelAmount;
private int fuelAmountMax;

public Tank(int fuelAmount, int fuelAmountMax){
    this.fuelAmount = fuelAmount;
    this.fuelAmountMax =  fuelAmountMax;
}

    public int getFuelAmount() {
        return fuelAmount;
    }

    public int getFuelAmountMax() {
        return fuelAmountMax;
    }

}