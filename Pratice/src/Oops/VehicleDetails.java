package Oops;

abstract class vehicle_ {
    abstract void start();

    public void fuel() {
        System.out.println("Filling fuel...");
    }
}

class Car extends vehicle_ {
    @Override
    void start() {
        System.out.println("Car starts with a key.");
    }
}

class Bike extends vehicle_ {
    @Override
    void start() {
        System.out.println("Bike starts with a button.");
    }
}

public class VehicleDetails {
    public static void main(String[] args) {
        vehicle_[] vehicles = { new Car(), new Bike() };

        for (vehicle_ v : vehicles) {
            v.start();
            v.fuel();
        }
    }
}
