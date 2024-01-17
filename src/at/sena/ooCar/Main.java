package at.sena.ooCar;

public class Main {
    public static void main(String[]args) {
        Engine e1 = new Engine(150, Engine.TYPE.DIESEL);
        Tank t1 = new Tank(80, 100);
        RearMirror r1 = new RearMirror(100, 0);
        RearMirror r2 = new RearMirror(90, -40);
        Tire tire1 = new Tire(20, 0);
        Tire tire2 = new Tire(30, 1);
        Tire tire3 = new Tire(40, 2);
        Tire tire4 = new Tire(50, 3);

        Car myCar = new Car(e1, t1,10,"BMW,","1234");
        myCar.addMirror(r1);
        myCar.addMirror(r2);
        myCar.addTire(tire1);
        myCar.addTire(tire2);
        myCar.addTire(tire3);
        myCar.addTire(tire4);
        myCar.setColor("blue");
        myCar.setAmountOfRepetitions(5);

        myCar.drive(80, 50);

        System.out.println(myCar.getTires().get(0).getPosition());
    }
}
