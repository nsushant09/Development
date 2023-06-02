package designpatterns.prototype;

public class User implements Prototype{

    String name;
    double number;
    String address;

    public User(String name, double number, String address) {
        this.name = name;
        this.number = number;
        this.address = address;
    }

    User(User user){
        this.name = user.name;
        this.number = user.number;
        this.address = user.address;
    }


    @Override
    public Prototype clone() {
        return new User(this);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", address='" + address + '\'' +
                '}';
    }
}
