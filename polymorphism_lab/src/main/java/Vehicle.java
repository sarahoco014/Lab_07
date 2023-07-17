public class Vehicle {

    private int numberOfWheels;
    private int maximumOccupancy;
    private String travelType;
    private int sellPrice;
    private int costToMake;

    public Vehicle(int numberOfWheels, int maximumOccupancy, String travelType, int sellPrice, int costToMake) {
        this.numberOfWheels = numberOfWheels;
        this.maximumOccupancy = maximumOccupancy;
        this.travelType = travelType;
        this.sellPrice = sellPrice;
        this.costToMake = costToMake;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public int getMaximumOccupancy() {
        return maximumOccupancy;
    }

    public String getTravelType() {
        return travelType;
    }

    public int getSellPrice() {
        return sellPrice;
    }

    public int getCostToMake() {
        return costToMake;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public void setMaximumOccupancy(int maximumOccupancy) {
        this.maximumOccupancy = maximumOccupancy;
    }

    public void setTravelType(String travelType) {
        this.travelType = travelType;
    }

    public void setSellPrice(int sellPrice) {
        this.sellPrice = sellPrice;
    }

    public void setCostToMake(int cost) {
        this.costToMake = cost;
    }
}
