package RockPaperScissor;

import java.util.Scanner;

public class ValueGenerator {

    public static Scanner sc = new Scanner(System.in);

    public int getUserValue() {
        System.out.println("Enter your choice (1-3) : ");
        System.out.println("1. Rock");
        System.out.println("2. Paper");
        System.out.println("3. Scissor");
        System.out.println("Your choice : ");

        return sc.nextInt();
    }

    public int getAutomatedValue() {
        return (int) (1 + Math.random() * (3 - 1));
    }
}
