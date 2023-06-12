package components;

public class Tyre {

    public String make;

    public int tread;

    public Tyre(String make, int tread) {
        this.make = make;
        this.tread = tread;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getTread() {
        return tread;
    }

    public void setTread(int tread) {
        this.tread = tread;
    }
}
