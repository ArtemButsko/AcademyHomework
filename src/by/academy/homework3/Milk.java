package by.academy.homework3;

public class Milk extends Product{

    private int milkFatPercentage;

    public Milk(double quantity, double price, String name, int milkFatPercentage) {
        super(quantity, price, name);
        this.milkFatPercentage = milkFatPercentage;
    }

    public Milk(double quantity, double price, int milkFatPercentage) {
        super(quantity, price);
        this.milkFatPercentage = milkFatPercentage;
    }
    public Milk(int milkFatPercentage){
        this.milkFatPercentage = milkFatPercentage;
    }

    public void setContainerVolume(int milkFatPercentage) {
        this.milkFatPercentage = milkFatPercentage;
    }

    public int getContainerVolume() {
        return milkFatPercentage;
    }

    @Override
    protected double discount() {
        return 1;
    }

    @Override
    public String toString() {
        return "Milk{" +
                "the fat percentage of milk = '" + milkFatPercentage + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", name='" + name + '\'' +
                '}';
    }


}
