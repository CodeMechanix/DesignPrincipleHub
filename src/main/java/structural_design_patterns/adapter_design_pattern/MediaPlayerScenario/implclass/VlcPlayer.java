package structural_design_patterns.adapter_design_pattern.MediaPlayerScenario.implclass;

import structural_design_patterns.adapter_design_pattern.MediaPlayerScenario.interfce.AdvancedMediaPlayer;

public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing VLC file. Name: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        // do nothing
    }
}
