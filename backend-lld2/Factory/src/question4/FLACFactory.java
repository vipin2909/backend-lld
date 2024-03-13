package question4;

import question4.player.AudioPlayer;
import question4.player.FLACPlayer;
import question4.processor.AudioProcessor;
import question4.processor.FLACProcessor;
import question4.decoder.AudioDecoder;
import question4.decoder.FLACDecoder;

public class FLACFactory extends AudioFactory {

    @Override
    public MediaFormat supportsFormat() {
        return MediaFormat.FLAC;
    }

    @Override
    public AudioPlayer createPlayer(int volume, double playBackRate) {
        return new FLACPlayer(volume, playBackRate);
    }

    @Override
    public AudioProcessor createProcessor(byte[] audioData) {
        return new FLACProcessor(audioData);
    }

    @Override
    public AudioDecoder createDecoder(byte[] audioData) {
        return new FLACDecoder(audioData);
    }
}
