import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class HelicopterTest {

    private Helicopter helicopter;

    @BeforeEach
    public void setUp() {
        helicopter = new Helicopter(40_000);
    }

    @Test
    public void canGetMaximumAltitude() {
        double actual = helicopter.getMaximumAltitude();
        double expected = 40_000;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canSetMaximumAltitude() {
        helicopter.setMaximumAltitude(50_000);
        double actual = helicopter.getMaximumAltitude();
        double expected = 50_000;
        assertThat(actual).isEqualTo(expected);
    }


    @Test
    public void canFly() {
        String actual = helicopter.fly();
        String expected = "I can fly!";
        assertThat(actual).isEqualTo(expected);
    }
}
