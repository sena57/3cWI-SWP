package at.sena.oo;

public class Car {
    public String color;
    public int fuelAmount;
    public int fuelConsumption;
    public String serialNumber;
    public String brand;

    public void drive() {
        this.fuelAmount = this.fuelAmount - fuelConsumption;
        System.out.println("I'm driving!");
    }

    public void breaks(){
        System.out.println("I'm breaking!");
    }
}
