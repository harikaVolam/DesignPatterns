package mediatorPattern.withoutMediatorPattern;

public class Button {
    private Fan fan;

    // constructor, getters and setters

    public void press(){
        if(fan.isOn){
            fan.turnOff();
        } else {
            fan.turnOn();
        }
    }
}
