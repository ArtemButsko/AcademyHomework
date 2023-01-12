package by.academy.homework3;

public class Sugar extends Product {
    private String color;

    public Sugar() {
        super();
    }

    public Sugar(String color){
        this.color = color;
    }

    public Sugar(double quantity, double price, String name, String color) {
        super(quantity, price, name);
        this.color = color;
    }

    public Sugar(double quantity, double price, String color) {
        super(quantity, price);
        this.color = color;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    protected double discount() {
        return this.getFullPrice() > 30 ? 0.7 : 1;
    }

    @Override
    public String toString() {
        return "Sugar{color = '" + color + "'\', quantity=" + quantity +
                ", price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}
