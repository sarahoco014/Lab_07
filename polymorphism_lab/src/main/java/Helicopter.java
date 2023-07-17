public class Helicopter {

    private double maximumAltitude;

    public Helicopter(double maximumAltitude) {
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

}
