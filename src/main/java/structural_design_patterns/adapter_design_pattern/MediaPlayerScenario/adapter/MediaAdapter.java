package structural_design_patterns.adapter_design_pattern.MediaPlayerScenario.adapter;

import structural_design_patterns.adapter_design_pattern.MediaPlayerScenario.implclass.Mp4Player;
import structural_design_patterns.adapter_design_pattern.MediaPlayerScenario.implclass.VlcPlayer;
import structural_design_patterns.adapter_design_pattern.MediaPlayerScenario.interfce.AdvancedMediaPlayer;
import structural_design_patterns.adapter_design_pattern.MediaPlayerScenario.interfce.MediaPlayerInterface;

public class MediaAdapter implements MediaPlayerInterface {
    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer = new VlcPlayer();
            advancedMediaPlayer.playVlc(fileName);
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer = new Mp4Player();
            advancedMediaPlayer.playMp4(fileName);
        }
    }

}
