// Superclass Device
class Device {
    String deviceId;
    String status;  // ON or OFF

    // Constructor
    Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
    }
}

// Subclass Thermostat
class Thermostat extends Device {
    int temperatureSetting;

    // Constructor
    Thermostat(String deviceId, String status, int temperatureSetting) {
        super(deviceId, status); // call parent constructor
        this.temperatureSetting = temperatureSetting;
    }

    @Override
    void displayStatus() {
        super.displayStatus(); // call Device method
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}

// Main class
public class Management {
    public static void main(String[] args) {
        Thermostat t = new Thermostat("TH123", "ON", 24);
        
        t.displayStatus();
    }
}
