package DSA.hackerrank;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-123));
    }

    public static boolean isPalindrome(int x){
        int xBackup = x;
        String remainder = "";
        while(xBackup > 0){
            remainder = remainder.concat(Integer.toString(xBackup % 10));
            xBackup /= 10;
        }
        try {
            return Integer.parseInt(remainder) == x;
        }catch (Exception e){
            return false;
        }
    }

    public static boolean isPalindromeMath(int x){
        int xBackup = Math.abs(x);
        int reverse = 0;

        while(xBackup > 0){
            reverse = (reverse * 10) + (xBackup % 10);
            xBackup /= 10;
        }

        return reverse == x;
    }
}
