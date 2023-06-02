package designpatterns.singleton;

public class Singleton {
    private static Singleton instance;
    private final String message;

    private Singleton(String message){this.message = message;};
    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton("This is the only singleton object");
        }
        return instance;
    }

    @Override
    public String toString() {
        return "Singleton{" +
                "message='" + message + '\'' +
                '}';
    }
}
