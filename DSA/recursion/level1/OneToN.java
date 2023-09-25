package DSA.recursion.level1;

public class OneToN {
    public static void main(String[] args) {
        printNum(5);
    }

    public static void printNum(int num){
        if(num == 0)
            return;
        printNum(num - 1);
        System.out.println(num);
    }
}
