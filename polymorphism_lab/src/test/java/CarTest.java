import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarTest {

    private Car car;

    @BeforeEach
    public void setUp() {
        car = new Car("Manual");
    }

    @Test
    public void canGetTransmissionType() {
        String actual = car.getTransmissonType();
        String expected = "Manual";

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canSetTransmissionType() {
        car.setTransmissonType("Automatic");

        String actual = car.getTransmissonType();
        String expected = "Automatic";

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canPlayMusic() {
        String actual = car.playMusic();
        String expected = "I am playing Taylor Swift music!";

        assertThat(actual).isEqualTo(expected);
    }
}
