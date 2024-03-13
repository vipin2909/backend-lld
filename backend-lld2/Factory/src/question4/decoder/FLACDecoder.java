package question4.decoder;

import question4.MediaFormat;

public class FLACDecoder extends AudioDecoder {

    public FLACDecoder(byte[] audioData) {
        super(audioData);
    }

    @Override
    public MediaFormat supportsFormat() {
        return MediaFormat.FLAC;
    }

    @Override
    public byte[] decode() {
        // Flac Decoding logic
        System.out.println("Getting audio data");
        return getAudioData();
    }


}
