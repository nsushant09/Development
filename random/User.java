package random;

public class User {
    String name;
    String age;
    String address;

    String password;

    private User() {
    }

//    Eager Initialization : When you are sure that the instance will be used no matter what i.e. the instance is created
//    Lazy Initialization : When the instance is created at run-time
//    Double-Lock Mechanism : Mechanism to prevent object creation from multiple threads at same time

    private static User instance = null;

    // public : access modifer
    // static : object dependency
    // void / User : return type
    // function name : main / getInstance()
    public static User getInstance() {
        if (instance == null) {
            instance = new User();
        }
        return instance;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", address='" + address + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
