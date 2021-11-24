package structural_design_patterns.adapter_design_pattern.MediaPlayerScenario.implclass;

import structural_design_patterns.adapter_design_pattern.MediaPlayerScenario.adapter.MediaAdapter;
import structural_design_patterns.adapter_design_pattern.MediaPlayerScenario.interfce.MediaPlayerInterface;

public class AudioPlayer implements MediaPlayerInterface {

    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing MP3. File Name: " + fileName);
        } else if (audioType.equalsIgnoreCase("mp4") || audioType.equalsIgnoreCase("vlc")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        } else {
            System.out.println("Invalid media. " + audioType + " format not supported.");
        }
    }
}
