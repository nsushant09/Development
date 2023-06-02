package designpatterns.prototype;

public class Main {
    public static void main(String[] args) {
        Prototype u = new User("Sushant Neupane", 982357912, "Kalanki");
        System.out.println(u);

        Prototype u2 = u.clone();
        System.out.println(u2);
    }
}
