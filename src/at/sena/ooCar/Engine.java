package at.sena.ooCar;

public class Engine {
    public enum TYPE {DIESEL, GAS};
    private int horsePower;
    private TYPE type; //Diesel oder Benzin

    public Engine(int horsePower, TYPE type) {
        this.horsePower = horsePower;
        this.type = type;
    }

    //amount should be between 0 and 100
    public void drive(int amount, int speed){
        System.out.println("the motor is running with " + amount + " and with: " + speed + "km/h");
    }
    public int getHorsePower(){
            return horsePower;
    }

    public TYPE getType() {
            return type;
    }

}
