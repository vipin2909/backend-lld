package question4.processor;

import question4.MediaFormat;

public class MP3Processor extends AudioProcessor {


    public MP3Processor(byte[] audioData) {
        super(audioData);
    }

    @Override
    public MediaFormat supportsFormat() {
        return MediaFormat.MP3;
    }

    @Override
    public byte[] process() {
        System.out.println("Processing Audio Data");
        return getAudioData();
    }

}
