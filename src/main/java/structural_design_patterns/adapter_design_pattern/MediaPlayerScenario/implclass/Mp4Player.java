package structural_design_patterns.adapter_design_pattern.MediaPlayerScenario.implclass;

import structural_design_patterns.adapter_design_pattern.MediaPlayerScenario.interfce.AdvancedMediaPlayer;

public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        // do nothing
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing MP4 file. File Name: " + fileName);
    }
}
