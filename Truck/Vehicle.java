package Truck;

public class Vehicle {
    private int passengers;
    private int fuelcap;
    private int mpg;

    // constructor
    Vehicle(int p, int f, int m) {
        this.passengers = p;
        this.fuelcap = f;
        this.mpg = m;
    }

    // return the range.
    public int range() {
        return mpg * fuelcap;
    }

    // compute fuel needed for a given distance
    public double fuelNeeded(int miles) {
        return (double) (miles / mpg);
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public int getFuelcap() {
        return fuelcap;
    }

    public void setFuelcap(int fuelcap) {
        this.fuelcap = fuelcap;
    }

    public int getMpg() {
        return mpg;
    }

    public void setMpg(int mpg) {
        this.mpg = mpg;
    }
}
