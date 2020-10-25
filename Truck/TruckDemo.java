package Truck;

public class TruckDemo {
    public static void main(String[] args) {
        
        // construct some trucks
        Truck semi = new Truck(2, 200, 7, 44000);
        Truck pickup = new Truck(3, 28, 15, 2000);

        double gallons;
        int distance = 252;

        gallons = semi.fuelNeeded(distance);
        System.out.println("Semi can carry " + semi.getCargoCap() + " pounds");
        System.out.println("To go " + distance + " miles, semi needs " + gallons + " gallons of fuel\n");

        gallons = pickup.fuelNeeded(distance);
        System.out.println("Pickup can carry " + semi.getCargoCap() + " pounds");
        System.out.println("To go " + distance + " miles, pickup needs " + gallons + " gallons of fuel\n");

    }
}