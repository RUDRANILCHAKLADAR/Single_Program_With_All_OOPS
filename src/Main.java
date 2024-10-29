
// OOP Concepts Demonstration in a single Java program

// 1. Abstraction
// Interface defining basic operations
interface Appliance {
    void turnOn();  // Abstract method
    void turnOff();
}

// 2. Encapsulation and Inheritance
// Base class ElectronicDevice implementing Appliance interface
class ElectronicDevice implements Appliance {
    // Encapsulation: private fields with public getters and setters
    private String brand;
    private String model;

    // Constructor to initialize brand and model
    public ElectronicDevice(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    // Getter and setter methods
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    // Implementing abstract methods from Appliance interface
    @Override
    public void turnOn() {
        System.out.println("Electronic Device is turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Electronic Device is turned off.");
    }

    // Method Overloading: Different versions of operateDevice method
    public void operateDevice() {
        System.out.println("Operating the device...");
    }

    public void operateDevice(String mode) {
        System.out.println("Operating the device in " + mode + " mode.");
    }

    // Polymorphism: This method will be overridden in derived classes
    public void showDetails() {
        System.out.println("This is a generic electronic device.");
    }
}

// Derived class Mobile inheriting from ElectronicDevice
class Mobile extends ElectronicDevice {
    private int batteryLife;

    // Constructor for Mobile
    public Mobile(String brand, String model, int batteryLife) {
        super(brand, model); // Calling superclass constructor
        this.batteryLife = batteryLife;
    }

    // Getter and setter for batteryLife
    public int getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(int batteryLife) {
        this.batteryLife = batteryLife;
    }

    // Method Overriding: Overriding showDetails method from ElectronicDevice
    @Override
    public void showDetails() {
        System.out.println("Mobile Brand: " + getBrand() + ", Model: " + getModel() + ", Battery Life: " + batteryLife + " hours");
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an instance of ElectronicDevice
        ElectronicDevice device = new ElectronicDevice("Generic", "DeviceModel");
        device.turnOn();
        device.operateDevice();              // Method overloading
        device.operateDevice("Eco");         // Method overloading
        device.showDetails();                // Show generic details
        device.turnOff();

        System.out.println();

        // Creating an instance of Mobile (Polymorphism, Inheritance)
        Mobile myPhone = new Mobile("Samsung", "Galaxy S21", 24);
        myPhone.turnOn();
        myPhone.showDetails();               // Method overriding
        myPhone.operateDevice("Performance"); // Method overloading
        myPhone.turnOff();
    }
}
