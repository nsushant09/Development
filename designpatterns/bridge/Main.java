package designpatterns.bridge;

public class Main {
    public static void main(String[] args) {
        Device tv = new Tv();
        Device radio = new Radio();

        Remote remote = new Remote(tv);
        AdvancedRemote advRemote = new AdvancedRemote(radio);

        System.out.println("Before");
        System.out.println(tv);
        System.out.println("After");
        remote.togglePower();
        remote.volumeUp();
        remote.channelUp();
        System.out.println(tv);

        System.out.println("Radio before");
        System.out.println(radio);
        System.out.println("After");
        advRemote.togglePower();
        advRemote.volumeUp();
        advRemote.channelUp();
        advRemote.mute();
        System.out.println(radio);
    }
}
