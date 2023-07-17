public class Car {

    private String transmissonType;

    public Car(String transmissonType) {
        this.transmissonType = transmissonType;
    }

    public String getTransmissonType() {
        return transmissonType;
    }

    public void setTransmissonType(String transmissonType) {
        this.transmissonType = transmissonType;
    }

    public String playMusic() {
        return "I am playing Taylor Swift music!";
    }
}
