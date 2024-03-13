package question3;

public class AudioPlayerFactory {

    public static AudioPlayer getAudioPlayer(MediaFormat mediaFormat, int volume, double playBackRate) throws IllegalAccessException {
        return switch(mediaFormat){
            case WAV -> new WAVPlayer(volume, playBackRate);
            case FLAC -> new FLACPlayer(volume, playBackRate);
            case MP3 -> new MP3Player(volume, playBackRate);
            default -> throw new IllegalAccessException("Invalid media format");
        };
    }
}
