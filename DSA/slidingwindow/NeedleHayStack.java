package DSA.slidingwindow;

public class NeedleHayStack {
    public static void main(String[] args) {
        System.out.println(strStr("abc", "c"));
    }

    public static int strStr(String haystack, String needle) {

        if (haystack.length() < needle.length()) {
            return -1;
        }

        StringBuilder substring = new StringBuilder(haystack.substring(0, needle.length()));
        if(needle.contentEquals(substring)) return 0;

        for (int i = 1; i < haystack.length() - needle.length() + 1; i++) {
            substring.delete(0, 1);
            substring.append(haystack.charAt(needle.length() - 1 + i));
            if (needle.contentEquals(substring)) {
                return i;
            }
        }

        return -1;
    }
}
