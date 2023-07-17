import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<Vehicle> vehicles;
    private double till;

    public Shop(String name, double till) {
        this.name = name;
        this.vehicles = new ArrayList<Vehicle>();
        this.till = till;
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
}
