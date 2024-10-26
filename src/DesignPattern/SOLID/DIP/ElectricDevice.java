package DesignPattern.SOLID.DIP;

public class ElectricDevice {

    private device device;

    public ElectricDevice(device device) {
        this.device = device;
    }

    public void switchOn(){
        device.turnOn();

    }
}
