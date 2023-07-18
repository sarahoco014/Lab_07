import interfaces.IBreak;

import java.util.ArrayList;
import java.util.List;

public class Shop {

    private String name;
    private ArrayList<Vehicle> vehicles;
    private double till;
    private List<IBreak> vehiclesThatCanBreak;


    public Shop(String name,
                double till) {
        this.name = name;
        this.vehicles = new ArrayList<Vehicle>();
        this.till = till;
        this.vehiclesThatCanBreak = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public double getTill() {
        return till;
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTill(double till) {
        this.till = till;
    }

    public void setVehicles(ArrayList<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public void addVehicleToStock(Vehicle vehicle) {
        this.vehicles.add(vehicle);
    }

    public int countVehicles() {
        return this.vehicles.size();
    }

    public void sellVehicle(Vehicle vehicle) {
        till += vehicle.getSellPrice();
        vehicles.remove(vehicle);
    }

    public void allVehiclesMakeNoise() { // all vehicles make noise when this method is called
        for (Vehicle vehicle : this.vehicles) {
            vehicle.makeNoise();
        }
    }

    public void addBreakableVehicles(IBreak car) {
        this.vehiclesThatCanBreak.add(car);
    }

    public List<IBreak> getBreakableVehicles() {
        return this.vehiclesThatCanBreak;
    }


}
