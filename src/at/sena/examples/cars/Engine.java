package at.sena.examples.cars;

public class Engine {
    public enum TYPE {DIESEL, GAS};
    private TYPE type;
    private int horsePower;

    public Engine(TYPE type, int horsePower) {
        this.type = type;
        this.horsePower = horsePower;
    }

    public TYPE getType() {
        return type;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
}
