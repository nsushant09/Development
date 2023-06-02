package designpatterns.adapter;

public class VlcPlayer implements AdvancedMediaPlayer{
    @Override
    public void play(String fileName) {
        System.out.println("Playing vlc file. Name : " + fileName);
    }
}
