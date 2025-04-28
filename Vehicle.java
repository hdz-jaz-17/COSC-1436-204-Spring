public class Vehicle {
    protected int speed; 
    private double fuel; 

    public Vehicle(int speed, double fuel) {
        this.speed = speed;
        this.fuel = fuel;
    }

    public void start() {
        System.out.println("Vehicle has started.");
    }

    public void stop() {
        System.out.println("Vehicle has stopped.");
    }

    public final void displayFuel() {
        System.out.println("Fuel level: " + fuel);
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }
}
public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(int speed, double fuel, int numberOfDoors) {
        super(speed, fuel);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void start() {
        System.out.println("Car has started! Vroom vroom!");
    }

    public void honk() {
        System.out.println("Beep Beep!");
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}
public class Bicycle extends Vehicle {
    private boolean hasBell;

    public Bicycle(int speed, double fuel, boolean hasBell) {
        super(speed, fuel);
        this.hasBell = hasBell;
    }

    @Override
    public void start() {
        System.out.println("Bicycle has started! Pedal away!");
    }

    public void ringBell() {
        if (hasBell) {
            System.out.println("Ring Ring!");
        } else {
            System.out.println("This bicycle has no bell.");
        }
    }

    public boolean getHasBell() {
        return hasBell;
    }

    public void setHasBell(boolean hasBell) {
        this.hasBell = hasBell;
    }
}
public class Main {
    public static void main(String[] args) {
        Car myCar = new Car(100, 50.5, 4);
        myCar.start();
        myCar.displayFuel();
        myCar.honk();

        System.out.println("----------------------------");

        Bicycle myBike = new Bicycle(20, 0, true);
        myBike.start();
        myBike.displayFuel();
        myBike.ringBell();
    }
}
