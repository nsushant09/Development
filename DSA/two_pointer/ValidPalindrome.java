package DSA.two_pointer;

public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(" "));
    }

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-zA-Z0-9]", "");

        char[] chars = s.toCharArray();

        for (int left = 0; left < chars.length / 2; left++) {
            int right = chars.length - 1 - left;
            if (chars[left] != chars[right]) {
                return false;
            }
        }

        return true;
    }
}
