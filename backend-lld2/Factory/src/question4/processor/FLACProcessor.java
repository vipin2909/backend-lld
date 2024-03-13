package question4.processor;

import question4.MediaFormat;

public class FLACProcessor extends AudioProcessor {

    public FLACProcessor(byte[] audioData) {
        super(audioData);
    }

    @Override
    public MediaFormat supportsFormat() {
        return MediaFormat.FLAC;
    }

    @Override
    public byte[] process() {
        // Flac Processing logic
        System.out.println("Getting audio data");
        return getAudioData();
    }


}
