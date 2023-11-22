package at.sena.oo;

public class Main {
    public static void main(String[]args) {
        Car myCar = new Car();
        myCar.brand = "BMW";
        myCar.fuelConsumption = 5;
        myCar.color = "blue";
        myCar.serialNumber = "S57";
        myCar.fuelAmount = 80;

        System.out.println(myCar.fuelAmount);
        myCar.drive();
        System.out.println(myCar.fuelAmount);

        myCar.breaks();
    }
}
