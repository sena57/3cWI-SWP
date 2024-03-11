package at.sena.examples.lamp;

import at.sena.examples.cars.Car;
import at.sena.examples.cars.Producer;

public class Lightelement {
    private String name;
    private String colour;
    private int consumption;
    public enum status {on, off};

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getConsumption() {
        return consumption;
    }

    public void setConsumption(int consumption) {
        this.consumption = consumption;
    }

    public void turnOn(){
        if (status == "on"){
            System.out.println("Mein name ist " + getName() + "");
        }
    }
}

