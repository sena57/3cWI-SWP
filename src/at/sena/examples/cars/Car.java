package at.sena.examples.cars;

public class Car {
    private String colour;
    private int maxSpeed;
    private int basePrice;
    private int baseConsumption;
    private Producer producer;
    private Engine engine;

    public Car(Engine engine, Producer producer,String colour, int maxSpeed, int basePrice, int baseConsumption) {
        this.engine = engine;
        this.producer = producer;
        this.colour = colour;
        this.maxSpeed = maxSpeed;
        this.basePrice = basePrice;
        this.baseConsumption = baseConsumption;
    }

    //getter and setter
    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(int basePrice) {
        this.basePrice = basePrice;
    }

    public int getBaseConsumption() {
        return baseConsumption;
    }

    public void setBaseConsumption(int baseConsumption) {
        this.baseConsumption = baseConsumption;
    }

    public Producer getProducer() {
        return producer;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    //calculating the new Price with the discount of the Producer
    public void newPrice(Car car, Producer producer){
        int sum =  0;
        int discount = this.basePrice * (this.producer.getDiscountInPercent()/100);
        sum = this.basePrice - discount;
        System.out.println(sum);
    }
}