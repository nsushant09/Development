package DSA.arrays_and_hashing;

public class ReverseWordsInStringIII {
    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
    }

    public static String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            words[i] = reverse(words[i]);
            output.append(words[i]).append(" ");
        }
        return output.toString().trim();
    }

    public static String reverse(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[chars.length - 1 - i];
            chars[chars.length - 1 - i] = temp;
        }
        return new String(chars);
    }
}
