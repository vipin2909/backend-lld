package question4.player;


import question4.MediaFormat;

public class MP3Player extends AudioPlayer {

    public MP3Player(int volume, double playBackRate) {
        super(volume, playBackRate);
    }

    @Override
    public MediaFormat supportsFormat() {
        return MediaFormat.MP3;
    }

    @Override
    public void play() {
        System.out.println("Playing MP3");
    }

    @Override
    public void pause() {
        System.out.println("PAUSE MP3");
    }

    @Override
    public void stop() {
        System.out.println("STOP MP3");
    }
}
