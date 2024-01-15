package at.sena.oo;

public class Main {
    public static void main(String[]args) {
        Engine e1 = new Engine(150, Engine.TYPE.DIESEL);
        Car myCar = new Car(e1,10,"BMW,","1234");
        myCar.setColor("blue");
        myCar.setFuelAmount(80);
        myCar.setFuelAmountMax(100);
        myCar.setAmountOfRepetitions(5);

        myCar.drive(80, 50);
    }
}
