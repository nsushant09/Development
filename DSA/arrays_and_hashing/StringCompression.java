package DSA.arrays_and_hashing;

public class StringCompression {
    public static void main(String[] args) {
        System.out.println(compress("aabccccaaa"));
    }

    public static String compress(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        int count = 1;

        for (int i = 0; i <= s.length(); i++) {
            if (i == 0) continue;
            if (i != s.length() && s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                stringBuilder.append(s.charAt(i - 1)).append(count);
                count = 1;
            }
        }

        return stringBuilder.toString();
    }
}
