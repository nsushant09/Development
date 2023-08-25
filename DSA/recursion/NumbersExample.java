package DSA.recursion;

public class NumbersExample {

    public static void main(String[] args) {
        //write a function that takes in a number and pritns it
        //print first 5 numbers : 1 2 3 4 5
        printNumber(5);
    }

    static void printNumber(int num){
        if (num == 0)
            return;

        printNumber(num - 1);
        System.out.println(num);
    }

}
