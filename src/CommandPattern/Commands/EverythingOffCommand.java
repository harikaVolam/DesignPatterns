package CommandPattern.Commands;

import CommandPattern.HardwareOrReceiver.KitchenLights;
import CommandPattern.HardwareOrReceiver.Music;

public class EverythingOffCommand implements Command{

    Music music;
    KitchenLights kitchenLights;

    public EverythingOffCommand(Music music, KitchenLights kitchenLights) {
        this.music = music;
        this.kitchenLights = kitchenLights;
    }

    @Override
    public void execute() {

        music.setVolume(0);
        music.setStation(0);
        music.off();
        kitchenLights.off();

    }
}
