public class Helicopter extends Vehicle {

    private double maximumAltitude;

    public Helicopter(int numberOfWheels,
                      int maximumOccupancy,
                      String travelType,
                      int sellPrice,
                      int costToMake,
                      double maximumAltitude) {
        super(numberOfWheels, maximumOccupancy, travelType, sellPrice, costToMake);
        this.maximumAltitude = maximumAltitude;
    }

    public double getMaximumAltitude() {
        return this.maximumAltitude;
    }

    public void setMaximumAltitude(int maximumAltitude) {
        this.maximumAltitude = maximumAltitude;
    }

    public String fly() {
        return "I can fly!";
    }

    @Override
    public String makeNoise() {
        return "Brrr!";
    }

}
