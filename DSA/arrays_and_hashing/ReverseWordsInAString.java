package DSA.arrays_and_hashing;

public class ReverseWordsInAString {
    public static void main(String[] args) {
        System.out.println(reverseWords("a good   example"));
    }

    public static String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < words.length / 2; i++) {
            String temp = words[i];
            words[i] = words[words.length - 1 - i];
            words[words.length - 1 - i] = temp;
        }
        for (String word : words) {
            if (!word.equals("")) {
                output.append(word).append(" ");
            }
        }
        return output.toString().trim();
    }
}
