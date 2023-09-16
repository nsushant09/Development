package DSA.slidingwindow;

public class KBeautyOfNumber {
    public static void main(String[] args) {
        System.out.println(divisorSubstrings(240, 2));
    }

    public static int divisorSubstrings(int num, int k) {
        int count = 0;
        int numberLength = getNumberLength(num);

        for (int i = k; i <= numberLength; i++) {
            int comparator = num / (int) Math.pow(10, numberLength - i);
            comparator = (int) (comparator % Math.pow(10, k));
            if(comparator == 0) continue;
            if (num % comparator == 0) count++;
        }

        return count;
    }

    public static int getNumberLength(int num) {
        int numberLength = 0;
        while (num > 0) {
            num /= 10;
            numberLength++;
        }
        return numberLength;
    }
}
