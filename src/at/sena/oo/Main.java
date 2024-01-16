package at.sena.oo;

public class Main {
    public static void main(String[]args) {
        Engine e1 = new Engine(150, Engine.TYPE.DIESEL);
        Tank t1 = new Tank(80, 100);
        RearMirror r1 = new RearMirror(100, 0);
        RearMirror r2 = new RearMirror(90, -40);

        Car myCar = new Car(e1, t1,10,"BMW,","1234");
        myCar.addMirror(r1);
        myCar.addMirror(r2);
        myCar.setColor("blue");
        myCar.setAmountOfRepetitions(5);

        myCar.drive(80, 50);

        System.out.println(myCar.getMirrors().get(0).getPosition());
    }
}
