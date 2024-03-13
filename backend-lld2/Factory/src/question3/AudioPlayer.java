package question3;

public abstract class AudioPlayer {
    private int volume;
    private double playBackRate;

    @Override
    public String toString() {
        return "AudioPlayer{" +
                "volume=" + volume +
                ", playBackRate=" + playBackRate +
                '}';
    }

    public AudioPlayer(int volume, double playBackRate) {
        this.volume = volume;
        this.playBackRate = playBackRate;
    }

    public abstract MediaFormat supportsType();

    public abstract void play();
    public abstract void pause();
    public abstract void stop();

    public int getVolume() {
        return this.volume;
    }

    public double getPlayBackRate() {
        return this.playBackRate;
    }

    public void setVolume(int setVolume) {
        if(volume >= 0 && volume <= 100) {
            this.volume = volume;
            System.out.println("Volume set to " + volume);
        }
        else {
            System.out.println("Invalid volume level");
        }
    }

}
