package OOP;


public class BMW extends CarPrice{

    private int price;
    private String model;
    private String col;



    public BMW(int price, String model, String col) {
        this.price = price;
        this.model = model;
        this.col = col;
    }

    public BMW() {

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
