package at.sena.examples.cars;

public class main {
    public static void main(String[] args) {
        Engine e1 = new Engine(Engine.TYPE.DIESEL,50);
        Producer p1 = new Producer("BMW","Germany",10);
        Car c1 = new Car(e1,p1, "blue", 200, 1000, 15);
        c1.newPrice(c1, p1);
    }
}
