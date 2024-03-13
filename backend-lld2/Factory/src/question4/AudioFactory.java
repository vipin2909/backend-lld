package question4;

import question4.processor.AudioProcessor;
import question4.player.AudioPlayer;
import question4.decoder.AudioDecoder;

public abstract class AudioFactory {

    public abstract MediaFormat supportsFormat();
    public abstract AudioProcessor createProcessor(byte[] audioData);
    public abstract AudioDecoder createDecoder(byte[] audioData);
    public abstract AudioPlayer createPlayer(int volume, double playBackRate);
}
