package CommandPattern;

import CommandPattern.Commands.KitchenLightsOffCommand;
import CommandPattern.Commands.KitchenLightsOnCommand;
import CommandPattern.Invoker.AlexaDevice;
import CommandPattern.HardwareOrReceiver.KitchenLights;


//There are 3 things in command pattern

//Invoker -> which takes command
//Commands -> Command has an object which performs the action..i.e command has reference of receiver injected
//Receiver -> which ultimately performs the action

//invoker->command->receiver

//The command pattern is equivalent of a callback function in procedural languages as we parametrize objects with an action to perform
public class Main {

    public static void main(String[] args) {
        AlexaDevice alexaDevice= new AlexaDevice();
        KitchenLights kitchenLights = new KitchenLights();
        alexaDevice.setCommand(0,new KitchenLightsOnCommand(kitchenLights),new KitchenLightsOffCommand(kitchenLights));
        alexaDevice.activateSlot(0);
        alexaDevice.deActivateSlot(0);
    }
}
