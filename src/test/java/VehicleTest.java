import components.Engine;
import components.Tyre;
import org.junit.Before;
import org.junit.Test;
import types.Vehicle;

import static org.junit.Assert.assertEquals;

public class VehicleTest {

    Vehicle vehicle;
    Engine engine;

    Tyre tyres;

    @Before
    public void before() {
        tyres = new Tyre("Michelin", 6);
        engine = new Engine(10);
        vehicle = new Vehicle(engine, tyres, 696969.00, "Maroon 5");
    }

    @Test
    public void hasColour() {
        assertEquals("Maroon 5", vehicle.getColour());
    }
}
