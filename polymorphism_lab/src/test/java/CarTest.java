import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarTest {

    private Car car;

    @BeforeEach
    public void setUp() {
        car = new Car(4, 5, "road", 50_000, 10_000, "Manual");
    }

    @Test
    public void canGetTransmissionType() {
        String actual = car.getTransmissionType();
        String expected = "Manual";

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canSetTransmissionType() {
        car.setTransmissionType("Automatic");

        String actual = car.getTransmissionType();
        String expected = "Automatic";

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canPlayMusic() {
        String actual = car.playMusic();
        String expected = "I am playing Taylor Swift music!";

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canMakeNoise() {
        String actual = car.makeNoise();
        String expected = "Vroom!";
        assertThat(actual).isEqualTo(expected);
    }
}
