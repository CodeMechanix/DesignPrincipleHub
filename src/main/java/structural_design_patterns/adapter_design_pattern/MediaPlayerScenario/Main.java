package structural_design_patterns.adapter_design_pattern.MediaPlayerScenario;

import structural_design_patterns.adapter_design_pattern.MediaPlayerScenario.implclass.AudioPlayer;

public class Main {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "wewanttomove.mp3");
        audioPlayer.play("vlc", "wewanttomove.vlc");
        audioPlayer.play("mp4", "wewanttomove.mp4");
        audioPlayer.play("mp5", "wewanttomove.mp5");
    }
}
