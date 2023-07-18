import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatCode;

public class ShopTest {

    private Shop shop;
    private Car car;
    private Train train;

    @BeforeEach
    public void setUp() {
        shop = new Shop("VehiclesRUs", 10_000);
        car = new Car(4, 5, "road", 50_000, 20_000, "Manual");
        train = new Train(100, 200, "rail", 100_000, 30_000, true, 7, "Overhead");
    }

    @Test
    public void canGetName() {
        String actual = shop.getName();
        String expected = "VehiclesRUs";

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canGetTill() {
        double actual = shop.getTill();
        double expected = 10_000;

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canGetVehicles() {
        ArrayList<Vehicle> actual = shop.getVehicles();
        ArrayList<Vehicle> expected = new ArrayList<Vehicle>();

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canSetName() {
        shop.setName("Vehicle Shop");

        String actual = shop.getName();
        String expected = "Vehicle Shop";

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canSetTill() {
        shop.setTill(2_000);

        double actual = shop.getTill();
        double expected = 2_000;

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canSetVehicle() {
        shop.setVehicles(new ArrayList<Vehicle>());

        ArrayList<Vehicle> actual = shop.getVehicles();
        ArrayList<Vehicle> expected = new ArrayList<Vehicle>();

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canAddVehicleToStock() {
        Car car = new Car(4, 5, "road", 50_000, 10_000, "Manual");
        shop.addVehicleToStock(car);

        assertThat(shop.countVehicles()).isEqualTo(1);
    }

    @Test
    public void canCountVehicles() {
        assertThat(shop.countVehicles()).isEqualTo(0);
    }

    @Test
    public void canSellVehicles() {
        Car car = new Car(4, 5, "Road", 50_000, 20_000, "Manual");

        shop.sellVehicle(car);

        double actualShopTill = shop.getTill();
        double expectedShopTill = 60_000;

        ArrayList<Vehicle> actualShopVehicles = shop.getVehicles();
        ArrayList<Vehicle> expectedShopVehicles = new ArrayList<Vehicle>();

        assertThat(actualShopTill).isEqualTo(expectedShopTill);
        assertThat(actualShopVehicles).isEqualTo(expectedShopVehicles);
    }

    @Test
    public void canAddMultipleVehiclesToStock() {
        Car car = new Car(4, 5, "road", 50_000, 20_000, "Manual");
        Helicopter helicopter = new Helicopter(2, 10, "air", 100_000, 20_000, 35_000);

        shop.addVehicleToStock(car);
        shop.addVehicleToStock(helicopter);
        shop.allVehiclesMakeNoise();

        assertThat(shop.countVehicles()).isEqualTo(2);
    }

    @Test
    public void canAddCarToShop() {
        shop.addBreakableVehicles(car);
        shop.addBreakableVehicles(train);

        System.out.println(shop.getBreakableVehicles());
    }
}
