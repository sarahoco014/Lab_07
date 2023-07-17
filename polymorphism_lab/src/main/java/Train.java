public class Train {

    private boolean operationalStatus;
    private int numberOfCarriages;
    private String powerSource;

    public Train(boolean operationalStatus, int numberOfCarriages, String powerSource) {
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

}
