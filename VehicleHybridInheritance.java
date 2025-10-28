// Hybrid Inheritance: Vehicle Management System
interface Refuelable {
    void refuel();
}

class Vehicle {
    int maxSpeed;
    String model;
}

class ElectricVehicle extends Vehicle {
    void charge() {
        System.out.println("Charging electric vehicle: " + model);
    }
}

class PetrolVehicle extends Vehicle implements Refuelable {
    public void refuel() {
        System.out.println("Refueling petrol vehicle: " + model);
    }
}

public class VehicleHybridInheritance {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle();
        ev.model = "Tesla Model 3";
        ev.charge();

        PetrolVehicle pv = new PetrolVehicle();
        pv.model = "Honda City";
        pv.refuel();
    }
}
