package by.academy.homework3;

public class LumpSugar extends Sugar{

    private int boxSize;

    public LumpSugar(){
        super();
    }

    public LumpSugar(int boxSize){
        this.boxSize = boxSize;
    }

    public LumpSugar(String color, int boxSize) {
        super(color);
        this.boxSize = boxSize;
    }
    public LumpSugar(double quantity, double price, String name, String color, int boxSize) {
        super(quantity, price, name, color);
        this.boxSize = boxSize;
    }

    public LumpSugar(double quantity, double price, String color, int boxSize) {
        super(quantity, price, color);
        this.boxSize = boxSize;
    }
    public int getBoxSize() {
        return boxSize;
    }

    public void setBoxSize(int boxSize) {
        this.boxSize = boxSize;
    }


}
