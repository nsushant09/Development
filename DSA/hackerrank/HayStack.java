package DSA.hackerrank;

public class HayStack {

    public static void main(String[] args) {
        System.out.println(strStr("badbutsad", "sad"));
    }

    public static int strStr(String haystack, String needle) {

        for(int i = 0; i <= haystack.length() - needle.length(); i++) {
            String sub = haystack.substring(i, i + needle.length());
            if (sub.equals(needle)) {
                return i;
            }
        }
        return -1;

    }

}