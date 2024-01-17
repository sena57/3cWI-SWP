package at.sena.ooCar;

import java.util.ArrayList;
import java.util.List;

public class Car {
    //Instanzen / Gedächtnisvariablen
    private Engine engine;
    private Tank tank;
    private List<RearMirror> mirrors;
    private List<Tire> tires;
    private String color;
    private int fuelConsumption;
    private String serialNumber;
    private String brand;
    private int amountOfRepetitions;

    public Car(Engine engine, Tank tank,int fuelConsumption, String brand, String serialNumber){
        this.engine = engine;
        this.tank = tank;
        this.fuelConsumption = fuelConsumption;
        this.brand = brand;
        this.serialNumber = serialNumber;
        this.mirrors = new ArrayList<>();
        this.tires = new ArrayList<>();
    }

    public void addMirror(RearMirror rearMirror){
        this.mirrors.add(rearMirror);
    }

    public List<RearMirror> getMirrors() {
        return mirrors;
    }

    public void addTire (Tire tires){ this.tires.add(tires); }
    public List<Tire> getTires() { return tires; }

    public void drive(int amount, int speed) {
        System.out.println("I'm driving!");
        this.engine.drive(amount, speed);
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
            double remainingRange = (double) this.tank.getFuelAmount() / fuelConsumption;
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


    //setter


    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setEngine(Engine engine){
        this.engine = engine;
    }


    //getter
    public int getAmountOfRepetitions() {
        return amountOfRepetitions;
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
    public Engine getEngine() { return engine; }


}
