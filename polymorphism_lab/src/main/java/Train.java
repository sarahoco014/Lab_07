import interfaces.IBreak;

public class Train extends Vehicle implements IBreak {

    private boolean operationalStatus;
    private int numberOfCarriages;
    private String powerSource;

    public Train(int numberOfWheels,
                 int maximumOccupancy,
                 String travelType,
                 int sellPrice,
                 int costToMake,
                 boolean operationalStatus,
                 int numberOfCarriages,
                 String powerSource) {
        super(numberOfWheels, maximumOccupancy, travelType, sellPrice, costToMake);
        this.operationalStatus = operationalStatus;
        this.numberOfCarriages = numberOfCarriages;
        this.powerSource = powerSource;
    }

    public boolean getOperationalStatus() {
        return operationalStatus;
    }

    public int getNumberOfCarriages() {
        return numberOfCarriages;
    }

    public String getPowerSource() {
        return powerSource;
    }

    public void setOperationalStatus(boolean status) {
        this.operationalStatus = status;
    }

    public void setNumberOfCarriages(int carriage) {
        this.numberOfCarriages = carriage;
    }

    public void setPowerSource(String powerSource) {
        this.powerSource = powerSource;
    }

    public void addCarriage(int carriage) {
        this.numberOfCarriages += carriage;
    }

    @Override
    public String makeNoise() {
        return "Choo Choo!";
    }

    public String emergencyBreak(boolean breaks) {
        return "I am able to emergency break on the tracks: " + breaks;
    }

}
