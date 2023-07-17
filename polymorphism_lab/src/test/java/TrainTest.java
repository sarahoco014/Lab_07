import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TrainTest {

    private Train train;

    @BeforeEach
    public void setUp() {
        train = new Train(100, 500, "rail", 1_000_000, 200_000, true, 7, "Overhead");
    }

    @Test
    public void canGetOperationalStatus() {
        boolean actual = train.getOperationalStatus();
        boolean expected = true;

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canGetNumberOfCarriages() {
        int actual = train.getNumberOfCarriages();
        int expected = 7;

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canGetPowerSource() {
        String actual = train.getPowerSource();
        String expected = "Overhead";

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canSetOperationalStatus() {
        train.setOperationalStatus(false);

        boolean actual = train.getOperationalStatus();
        boolean expected = false;

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canSetNumberOfCarriages() {
        train.setNumberOfCarriages(10);

        int actual = train.getNumberOfCarriages();
        int expected = 10;

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canSetPowerSource() {
        train.setPowerSource("Onboard Diesel");

        String actual = train.getPowerSource();
        String expected = "Onboard Diesel";

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canAddCarriage() {
        train.addCarriage(4);

        int actual = train.getNumberOfCarriages();
        int expected = 11;

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canMakeNoise() {
        String actual = train.makeNoise();
        String expected = "Choo Choo!";
        assertThat(actual).isEqualTo(expected);
    }

}
