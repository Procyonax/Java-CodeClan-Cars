package types;

import components.Engine;
import components.Tyre;

import java.util.ArrayList;

public class Petrol extends Vehicle{

    private String fuelType;
    public Petrol(Engine engine, Tyre tyres, double price, String colour) {
        super(engine, tyres, price, colour);
    }


    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
}
