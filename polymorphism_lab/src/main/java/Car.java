public class Car extends Vehicle {

    private String transmissionType;

    public Car(int numberOfWheels,
               int maximumOccupancy,
               String travelType,
               int sellPrice,
               int costToMake,
               String transmissionType) {
        super(numberOfWheels, maximumOccupancy, travelType, sellPrice, costToMake);
        this.transmissionType = transmissionType;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }

    public String playMusic() {
        return "I am playing Taylor Swift music!";
    }

    @Override
    public String makeNoise() {
        return "Vroom!";
    }
}
