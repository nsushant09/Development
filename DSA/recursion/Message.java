package DSA.recursion;

public class Message {
    public static void main(String[] args) {
        printHelloWorld(10);
    }

    static void printHelloWorld(int num) {
        if (num == 0)
            return;

        printHelloWorld(num - 1);
        System.out.println("Hello World" + num);
    }
}
