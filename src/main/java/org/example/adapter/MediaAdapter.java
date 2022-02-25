package org.example.adapter;

public class MediaAdapter implements MediaPlayer{

    AdvancedMediaPlayer advancedMusicPlayer;

    public void play(String audioType, String fileName) {

        if(audioType.equalsIgnoreCase("vlc")){
            advancedMusicPlayer = new VlcPlayer();
            advancedMusicPlayer.playVlc(fileName);
        }
        else if(audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer = new Mp4Player();
            advancedMusicPlayer.playMp4(fileName);
        }
    }
}
