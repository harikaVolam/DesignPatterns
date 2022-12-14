package CommandPattern.Commands;

import CommandPattern.HardwareOrReceiver.KitchenLights;

public class KitchenLightsOffCommand implements Command {

    KitchenLights kitchenLights;

    public KitchenLightsOffCommand(KitchenLights kitchenLights){
        this.kitchenLights=kitchenLights;
    }

    @Override
    public void execute() {
        kitchenLights.off();
    }
}
