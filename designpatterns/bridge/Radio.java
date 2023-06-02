package designpatterns.bridge;

public class Radio implements Device {

    boolean isOn = false;
    int volume = 50;
    int channel = 1;

    @Override
    public boolean isEnabled() {
        return this.isOn;
    }

    @Override
    public void enable() {
        this.isOn = true;
    }

    @Override
    public void disable() {
        this.isOn = false;
    }

    @Override
    public int getVolume() {
        return this.volume;
    }

    @Override
    public void setVolume(int percent) {
        if (percent < 0) {
            percent = 0;
        } else if (percent > 100) {
            percent = 100;
        }
        this.volume = percent;
    }

    @Override
    public int getChannel() {
        return this.channel;
    }

    @Override
    public void setChannel(int channel) {
        if (channel < 1) {
            channel = 1;
        }
        this.channel = channel;
    }

    @Override
    public String toString() {
        return "Radio{" +
                "isOn=" + isOn +
                ", volume=" + volume +
                ", channel=" + channel +
                '}';
    }
}
