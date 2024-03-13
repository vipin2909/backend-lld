package question4;

import question4.player.AudioPlayer;
import question4.player.MP3Player;
import question4.processor.AudioProcessor;
import question4.processor.MP3Processor;
import question4.decoder.AudioDecoder;
import question4.decoder.MP3Decoder;

public class MP3Factory extends AudioFactory {

    @Override
    public MediaFormat supportsFormat() {
        return MediaFormat.MP3;
    }

    @Override
    public AudioPlayer createPlayer(int volume, double playBackRate) {
        return new MP3Player(volume, playBackRate);
    }

    @Override
    public AudioProcessor createProcessor(byte[] audioData) {
        return new MP3Processor(audioData);
    }

    @Override
    public AudioDecoder createDecoder(byte[] audioData) {
        return new MP3Decoder(audioData);
    }
}
