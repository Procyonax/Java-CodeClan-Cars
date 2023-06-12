package types;

import components.Engine;
import components.Tyre;

import java.util.ArrayList;

public class Vehicle {

    private Engine engine;
    private Tyre tyres;

    private double price;
    private String colour;

    public String startEngine() {
        return this.engine.startEngine();
    }

    public Vehicle(Engine engine, Tyre tyres, double price, String colour) {
        this.engine = engine;
        this.tyres = tyres;
        this.price = price;
        this.colour = colour;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Tyre getTyres() {
        return tyres;
    }

    public void setTyres(Tyre tyres) {
        this.tyres = tyres;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
