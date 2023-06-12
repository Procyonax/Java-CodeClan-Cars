package types;

import components.Engine;
import components.Tyre;

import java.util.ArrayList;

public class Hybrid extends Vehicle{

    public int batteryCapacity;
    public String fuelType;
    public Hybrid(Engine engine, Tyre tyres, double price, String colour) {
        super(engine, tyres, price, colour);
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
}
