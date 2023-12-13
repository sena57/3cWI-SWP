package at.sena.oo;

public class Car {
    //Instanzen / Gedächtnisvariablen
    private String color;
    private int fuelAmount;
    private int fuelConsumption;
    private String serialNumber;
    private String brand;
    private int fuelAmountMax;
    private int amountOfRepetitions;

    public Car(int fuelConsumption, String brand, String serialNumber){
        this.fuelConsumption = fuelConsumption;
        this.brand = brand;
        this.serialNumber = serialNumber;
    }

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
            System.out.println("Tuuuuuuuuuuuut");
        }
    }

    public void getRemainingRange() {
        if (fuelConsumption != 0) {
            double remainingRange = (double) fuelAmount / fuelConsumption;
            System.out.println("Remaining Range:" + remainingRange);
        } else {
            System.out.println("Error");
        }
    }

    //setter
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setAmountOfRepetitions(int amountOfRepetitions) {
        this.amountOfRepetitions = amountOfRepetitions;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFuelAmount(int fuelAmount) {
        if(fuelAmount>100) {
            this.fuelAmount = 100;
        } else {
            this.fuelAmount = fuelAmount;
        }
    }

    public void setFuelAmountMax(int fuelAmountMax) {
        this.fuelAmountMax = fuelAmountMax;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }


    //getter
    public int getAmountOfRepetitions() {
        return amountOfRepetitions;
    }

    public int getFuelAmount() {
        return fuelAmount;
    }

    public int getFuelAmountMax() {
        return fuelAmountMax;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public String getSerialNumber() {
        return serialNumber;
    }
}
