package at.sena.oo;

public class Main {
    public static void main(String[]args) {
        Car myCar = new Car(5, "BMW", "S57");
        myCar.setColor("blue");
        myCar.setFuelAmount(80);
        myCar.setFuelAmountMax(100);
        myCar.setAmountOfRepetitions(5);

        Car c2 = new Car(10,"Mercedes", "Oezcan123");


        System.out.println(myCar.getFuelAmount());
        myCar.drive();
        System.out.println(myCar.getFuelAmount());

        myCar.breaks();
        myCar.turboBoost(myCar.getFuelAmount(), myCar.getFuelAmountMax());
        myCar.honk(myCar.getAmountOfRepetitions());
        myCar.getRemainingRange();

    }
}
