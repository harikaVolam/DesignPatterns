package CommandPattern.Commands;

import CommandPattern.HardwareOrReceiver.KitchenLights;
import CommandPattern.HardwareOrReceiver.Music;

public class EverythingOnCommand implements Command{

    Music music;
    KitchenLights kitchenLights;

    public EverythingOnCommand(Music music, KitchenLights kitchenLights) {
        this.music = music;
        this.kitchenLights = kitchenLights;
    }

    @Override
    public void execute() {

        music.on();
        music.setStation(99.9F);
        music.setVolume(10);
        kitchenLights.on();
    }
}
