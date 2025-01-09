package design_patterns.behavioral.strategy.entities;

public abstract class Order {
    private float price;
    private Shipping shippingType;

    public Order(float price, Shipping shippingType) {
        this.price = price;
        this.shippingType = shippingType;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Shipping getShippingType() {
        return shippingType;
    }

    public void setShippingType(Shipping shippingType) {
        this.shippingType = shippingType;
    }

    public float calculateShipping() {
        return this.shippingType.calculate(this.price);
    }
}
