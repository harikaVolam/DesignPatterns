package mediatorPattern.withoutMediatorPattern;

public class Fan {
    private Button button;
    private PowerSupplier powerSupplier;
    public boolean isOn = false;

    // constructor, getters and setters

    public void turnOn() {
        powerSupplier.turnOn();
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
        powerSupplier.turnOff();
    }
}