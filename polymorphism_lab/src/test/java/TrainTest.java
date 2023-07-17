import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TrainTest {

    private Train train;

    @BeforeEach
    public void setUp() {
        train = new Train(true, 4, "Electric");
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
        int expected = 4;

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canGetPowerSource() {
        String actual = train.getPowerSource();
        String expected = "Electric";

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
        int expected = 8;

        assertThat(actual).isEqualTo(expected);
    }

}
