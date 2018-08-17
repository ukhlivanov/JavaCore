package OOP;


public class Audi extends CarPrice {

    private int price;
    private String model;
    private String col;

    public Audi(int price, String model, String col) {
        this.price = price;
        this.model = model;
        this.col = col;
    }
    public Audi() {

    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCol() {
        return col;
    }

    public void setCol(String col) {
        this.col = col;
    }

    @Override
    public String modelVehicle() {
        return model;
    }

    @Override
    public String colorOfVehicle() {
        return col;
    }
}
