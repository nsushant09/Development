package DSA.recursion.level1;

public class Nto1 {
    public static void main(String[] args) {
        printNum(5);
    }

    public static void printNum(int num){
        if(num == 0)
            return;

        System.out.println(num);
        printNum(num - 1);
    }
}
