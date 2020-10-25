package Truck;

public class Truck extends Vehicle {
    
    private int cargoCap;

    Truck(int p, int f, int m, int c) {
        super(p, f, m);
        this.cargoCap = c;
    }

    public int getCargoCap() {
        return cargoCap;
    }

    public void setCargoCap(int cargoCap) {
        this.cargoCap = cargoCap;
    }
}
