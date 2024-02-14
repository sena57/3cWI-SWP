package at.sena.examples.cars;

public class Producer {
    private String producerName;
    private String origin;
    private int discountInPercent;

    public Producer(String producerName, String origin, int discountInPercent) {
        this.producerName = producerName;
        this.origin = origin;
        this.discountInPercent = discountInPercent;
    }

    public String getProducerName() {
        return producerName;
    }

    public void setProducerName(String producerName) {
        this.producerName = producerName;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public int getDiscountInPercent() {
        return discountInPercent;
    }

    public void setDiscountInPercent(int discountInPercent) {
        this.discountInPercent = discountInPercent;
    }


}
