package question4.player;


import question4.MediaFormat;

public class FLACPlayer extends AudioPlayer {

    public FLACPlayer(int volume, double playBackRate) {
        super(volume, playBackRate);
    }

    @Override
    public MediaFormat supportsFormat() {
        return MediaFormat.FLAC;
    }

    @Override
    public void play() {
        System.out.println("Playing FLAC");
    }

    @Override
    public void pause() {
        System.out.println("PAUSE FLAC");
    }

    @Override
    public void stop() {
        System.out.println("STOP FLAC");
    }
}
