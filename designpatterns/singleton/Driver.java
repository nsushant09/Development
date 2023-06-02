package designpatterns.singleton;

public class Driver {
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
        System.out.println(s);

        Singleton s2 = Singleton.getInstance();
        System.out.println(s2);
    }
}
