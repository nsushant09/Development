package designpatterns.bridge;

public class AdvancedRemote extends Remote{
    AdvancedRemote(Device device) {
        super(device);
    }

    public void mute(){
        device.setVolume(0);
    }
}
