package at.sena.examples.lamp;

public class Lightelement {
    private String name;
    private String colour;
    private int powerUsage;
    public enum TYPE{on, off};
    private Lightelement.TYPE status;

    public TYPE getStatus() {
        return status;
    }

    public void setStatus(TYPE status) {
        this.status = status;
    }

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

    public int getPowerUsage() {
        return powerUsage;
    }

    public void setPowerUsage(int powerUsage) {
        this.powerUsage = powerUsage;
    }

    public void turnOn(Lightelement lightelements){
        if (getStatus() == TYPE.on){
            System.out.println("Mein name ist " + getName() + ". Ich bin bereits eingeschaltet.");
        } else {
            setStatus(TYPE.on);
        }
    }

    public void turnAllOn(){
        getStatus();
        if (getStatus() == TYPE.off){
            setStatus(TYPE.on);
        } else {
            System.out.println("Mein name ist " + getName() + ". Ich bin bereits eingeschaltet.");
        }
    }

    public void getOverallPowerUsage(){
        getPowerUsage();

    }
}

