package question4.player;

import question4.MediaFormat;

public abstract class AudioPlayer {
    private int volume;
    private double playBackRate;

    public AudioPlayer(int volume, double playBackRate) {
        this.volume = volume;
        this.playBackRate = playBackRate;
    }

//    @Override
//    public abstract AudioPlayer(int volume, double playBackRate);

    public abstract MediaFormat supportsFormat();
    public abstract void pause();
    public abstract void play();
    public abstract void stop();

    public int getVolume() {
        return volume;
    }

    public double getPlayBackRate() {
        return playBackRate;
    }

    public void setVolume(int volume) {
        if(volume >= 0 && volume <= 100) {
            this.volume = volume;
            System.out.println("Volume setting to " + volume);
        }
        else {
            System.out.println("Invalid volume level");
        }
    }
}
