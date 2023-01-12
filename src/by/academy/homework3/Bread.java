package by.academy.homework3;

public class Bread extends Product{

    private String colorBread;
    KindOfBread kind;

    public Bread(String colorBread, KindOfBread type) {
        this.colorBread = colorBread;
        this.kind = type;
    }
    public Bread(double quantity, double price, String name, String country, KindOfBread type) {
        super(quantity, price, name);
        this.colorBread = country;
        this.kind = type;
    }
    public Bread(double quantity, double price, String country, KindOfBread type) {
        super(quantity, price);
        this.colorBread = country;
        this.kind = type;
    }

    public void setColorBread(String colorBread) {
        this.colorBread = colorBread;
    }

    public String getColorBread() {
        return colorBread;
    }

    public void setKind(KindOfBread kind) {
        this.kind = kind;
    }

    public KindOfBread getKind() {
        return kind;
    }

    @Override
    protected double discount() {

        if(kind.equals(KindOfBread.BLACK_BREAD)){
            return 0.8;
        } else if (kind.equals(KindOfBread.WHITE_BREAD)) {
           return 1;
        } else if (kind.equals(KindOfBread.TOAST_BREAD)) {
            return 0.5;
        }else {
            return 1;
        }
    }

    @Override
    public String toString() {
        return "Bread{" +
                "color='" + colorBread + '\'' +
                ", kind=" + kind +
                ", quantity=" + quantity +
                ", price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}
