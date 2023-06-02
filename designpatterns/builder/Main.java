package designpatterns.builder;

public class Main {
    public static void main(String[] args) {
        Phone p = new Phone.Builder().processor("Hello").build();
    }
}
