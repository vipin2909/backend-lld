package question3;



public class AudioFactoryTest {
    public static void main(String[] args) throws IllegalAccessException {
        AudioPlayer mp3Player = AudioPlayerFactory.getAudioPlayer(MediaFormat.MP3, 23, 50.0);
        System.out.println(mp3Player);
    }
}
