package at.sena.oo;

public class Car {
    public String color;
    public int fuelAmount;
    public int fuelConsumption;
    public String serialNumber;
    public String brand;
    public int fuelAmountMax;
    public int amountOfRepetitions;

    public void drive() {
        this.fuelAmount = this.fuelAmount - fuelConsumption;
        System.out.println("I'm driving!");
    }

    public void breaks(){
        System.out.println("I'm breaking!");
    }

    public void turboBoost(int fuelAmount, int fuelAmountMax) {
        if (fuelAmount > fuelAmountMax*0.1){
            System.out.println("SuperBoostMode");
        } else {
            System.out.println("Not enough fuel to go Superboost");
        }
    }

    public void honk(int amountOfRepetitions){
        for (int i = 0; i < amountOfRepetitions; i++) {
            System.out.println("Tuuut");
        }
    }

    public void getRemainingRange(){
        restFuel =
    }
}
