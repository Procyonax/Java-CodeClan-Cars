package shop;

import types.Vehicle;

import java.util.ArrayList;

public class Customer {

    public double money;
    public ArrayList<Vehicle> ownedVehicles;

    public Customer(double money) {
        super();
        this.money = money;
        this.ownedVehicles = ownedVehicles;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public ArrayList<Vehicle> getOwnedVehicles() {
        return ownedVehicles;
    }

    public void setOwnedVehicles(ArrayList<Vehicle> ownedVehicles) {
        this.ownedVehicles = ownedVehicles;
    }

    public void getCar(Vehicle car) {
        ownedVehicles.add(car);
        money -= car.getPrice();
    }

}
