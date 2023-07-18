import interfaces.IBreak;

public class Car extends Vehicle implements IBreak {

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

    // Overloaded Method

    public String playMusic(String musicType) {
        return "I am playing " + musicType + " music!";
    }

    @Override
    public String makeNoise() {
        return "Vroom!";
    }

    public String breaking(boolean breaks) {
        return "I am able to emergency break on the road: " + breaks;
    }



}
