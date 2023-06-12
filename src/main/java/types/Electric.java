package types;

import components.Engine;
import components.Tyre;

import java.util.ArrayList;

public class Electric extends Vehicle{

    private int batteryCapacity;

    public Electric(Engine engine, Tyre tyres, double price, String colour, int batteryCapacity) {
        super(engine, tyres, price, colour);
        this.batteryCapacity = batteryCapacity;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }
}
