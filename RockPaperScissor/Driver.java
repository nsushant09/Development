package RockPaperScissor;

import java.util.Random;
import java.util.Scanner;

public class Driver {
    private final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Element userValue = ElementFactory.getElement(getUserValue());
        Element automatedValue = ElementFactory.getElement(getAutomatedValue());

        Result result = userValue.getResult(automatedValue);

        System.out.println("You chose : " + userValue.getName());
        System.out.println("System chose : " + automatedValue.getName());
        displayResult(result);
    }

    public static String getUserValue() {
        System.out.println("Enter your choice (1-3) : ");
        System.out.println("1. Rock");
        System.out.println("2. Paper");
        System.out.println("3. Scissor");
        System.out.println("Your choice : ");

        int input = sc.nextInt();
        return getElementName(input);
    }

    public static String getAutomatedValue() {
        int input = (int) (1 + Math.random() * (3 - 1));
        return getElementName(input);
    }

    public static String getElementName(int input) {
        String[] elements = {"ROCK", "PAPER", "SCISSOR"};
        try {
            if (input - 1 <= elements.length && input - 1 >= 0) {
                return elements[input - 1];
            } else {
                System.out.println("Invalid input");
            }
        } catch (Exception e) {
            System.out.println("Invalid Input");
        }

        return null;
    }

    public static void displayResult(Result result) {
        if (result == Result.DRAW)
            System.out.println("Draw");
        else if (result == Result.WON)
            System.out.println("Won");
        else
            System.out.println("Lost");
    }
}
