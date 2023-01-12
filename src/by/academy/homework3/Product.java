package by.academy.homework3;

public abstract class Product {
    protected double quantity;
    protected double price;
    protected String name;

    public Product() {
        super();
    }

    public Product(double quantity, double price, String name) {
        this(quantity, price);
        this.name = name;
    }

    public Product(double quantity, double price) {
        this.quantity = quantity;
        this.price = price;
    }
    public double getQuantity() {
        return quantity;
    }
    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    double getFullPrice() {
        return quantity * price;
    }
    protected abstract double discount();

    final double calcPrice() {
        return getFullPrice() * discount();
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Product{" +
                "quantity=" + quantity +
                ", price=" + price +
                ", name='" + name + '\'' +
                '}';
    }

}