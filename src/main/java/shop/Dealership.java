package shop;

import types.Vehicle;

import java.util.ArrayList;

public class Dealership {

    public int totalCash;

    public ArrayList<Vehicle> vehicles;

    public Dealership(int totalCash, ArrayList<Vehicle> vehicles) {
        this.totalCash = totalCash;
        this.vehicles = vehicles;
    }

    public int getTotalCash() {
        return totalCash;
    }

    public void setTotalCash(int totalCash) {
        this.totalCash = totalCash;
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(ArrayList<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }
}
