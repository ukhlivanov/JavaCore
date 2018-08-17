package OOP;


abstract public class CarPrice implements ICars {

    void print(ICars car){
        System.out.println(car.colorOfVehicle() + " " + " " + car.modelVehicle());
    }
}
