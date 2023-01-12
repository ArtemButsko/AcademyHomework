package by.academy.homework3;

public class Eggs extends Product {

    private int sizeEggs;

    public Eggs() {
        super();
    }
    public Eggs(double quantity, double price, int sizeEggs) {
        super(quantity, price);
        this.sizeEggs = sizeEggs;
    }

    public Eggs(int sizeEggs) {
        this.sizeEggs = sizeEggs;
    }

    public void setSizeEggs(int sizeEggs) {
        this.sizeEggs = sizeEggs;
    }

    public int getSizeEggs() {
        return sizeEggs;
    }

    @Override
    protected double discount() {
        return 1;
    }

    @Override
    public String toString() {
        return "Eggs{" +
                "size =" + sizeEggs +
                ", quantity=" + quantity +
                ", price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}
