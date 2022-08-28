package CommandPattern.Commands;

import CommandPattern.HardwareOrReceiver.Music;

public class MusicOnCommand implements Command{

    Music music;


    public MusicOnCommand(Music music) {
        this.music = music;
    }

    @Override
    public void execute() {
        music.on();
        music.setStation(99.9F);
        music.setVolume(10);

    }
}
