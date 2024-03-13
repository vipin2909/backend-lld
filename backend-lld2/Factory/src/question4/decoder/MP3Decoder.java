package question4.decoder;

import question4.MediaFormat;

public class MP3Decoder extends AudioDecoder {


    public MP3Decoder(byte[] audioData) {
        super(audioData);
    }

    @Override
    public MediaFormat supportsFormat() {
        return MediaFormat.MP3;
    }

    @Override
    public byte[] decode() {
        // Implement Mp3 Decoding Logic
        System.out.println("Getting audio data");
        // Decoding Process
        return getAudioData();
    }
}
