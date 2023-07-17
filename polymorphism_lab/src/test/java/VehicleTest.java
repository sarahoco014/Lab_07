import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class VehicleTest {

    private Vehicle vehicle;

    @BeforeEach
    public void setUp() {
        vehicle = new Vehicle(4, 5, "road", 20_000, 5_000);
    }

    @Test
    public void canGetNumberOfWheels() {
        int actual = vehicle.getNumberOfWheels();
        int expected = 4;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canGetMaxiumumOccupancy() {
        int actual = vehicle.getMaximumOccupancy();
        int expected = 5;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canGetTravelType() {
        String actual = vehicle.getTravelType();
        String expected = "road";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canGetSellPrice() {
        int actual = vehicle.getSellPrice();
        int expected = 20_000;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canGetCost() {
        int actual = vehicle.getCostToMake();
        int expected = 5_000;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canSetNumberOfWheels() {
        vehicle.setNumberOfWheels(2);
        int actual = vehicle.getNumberOfWheels();
        int expected = 2;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canSetMaxiumumOccupancy() {
        vehicle.setMaximumOccupancy(10);
        int actual = vehicle.getMaximumOccupancy();
        int expected = 10;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canSetTravelType() {
        vehicle.setTravelType("air");
        String actual = vehicle.getTravelType();
        String expected = "air";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canSetSellPrice() {
        vehicle.setSellPrice(50_000);
        int actual = vehicle.getSellPrice();
        int expected = 50_000;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canSetCostToMake() {
        vehicle.setCostToMake(10_000);
        int actual = vehicle.getCostToMake();
        int expected = 10_000;
        assertThat(actual).isEqualTo(expected);
    }
}
